package panyujie.practice.TwoSum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends JFrame {
    
    private static final String initial_Text = "00:00:00 000";
    // 计数线程
    private static CountingThread thread = new CountingThread();
    // 记录程序开始时间
    private static long programStart = System.currentTimeMillis();
    // 程序开始就是暂停的
    private static long pauseStart = programStart;
    // 程序暂停的总时间
    private static long pauseCount = 0;

    private static JLabel label = new JLabel(initial_Text);
    private static JButton startPauseButton = new JButton("开始");
    private static JButton resetButton = new JButton("清零");

    public Timer(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 300);
        setResizable(false);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 40));
        this.add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(startPauseButton);
        panel.add(resetButton);
        add(panel, BorderLayout.SOUTH);

        startPauseButton.addActionListener(startPauseButtonListener);
        resetButton.addActionListener(resetButtonListener);

        thread.start();
        thread.stopped=false;
    }



    private static class CountingThread extends Thread {
        public boolean stopped = true;

        private CountingThread() {
            setDaemon(true); // 守护线程
        }

        @Override
        public void run() {
            while (true) {
                if (!stopped) {
                    long cost = System.currentTimeMillis() - programStart - pauseCount;
                    String ccost=format(cost);
                    label.setText(ccost);
                    if(cost>10000){
                        stopped=true;
                        pauseStart = programStart;
                        pauseCount = 0;
                        label.setText(format(10000)); //设置时间
                        AddGUI.label.setForeground(Color.red);
                        AddGUI.label.setText("时间到       ");
                        startPauseButton.setText("重新开始");
                        new tips(" time runs out");

                        ResetOption();

                    }
                }
                try {
                    sleep(1);  // 1毫秒更新一次显示
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // 毫秒数格式化
        private static String format(long ttime) {
            int hour, minute, second, milli;
            milli = (int) (ttime % 1000);
            ttime = ttime / 1000;
            second = (int) (ttime % 60);
            ttime = ttime / 60;
            minute = (int) (ttime % 60);
            ttime = ttime / 60;
            hour = (int) (ttime % 60);
            return String.format("%02d:%02d:%02d %03d", hour, minute, second, milli);
        }
    }

    private ActionListener startPauseButtonListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (thread.stopped) {
                pauseCount += (System.currentTimeMillis() - pauseStart);
                thread.stopped = false;
                startPauseButton.setText("暂停");
            } else {
                pauseStart = System.currentTimeMillis();
                thread.stopped = true;
                startPauseButton.setText("继续");
            }
        }
    };

    private ActionListener resetButtonListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            pauseStart = programStart;
            pauseCount = 0;
            thread.stopped = true;
            label.setText(initial_Text);
            startPauseButton.setText("开始");
            AddGUI.label.setText("欢迎再次挑战     ");
            AddGUI.False=0;
            AddGUI.True=0;
            AddGUI.questions.setText("pass: "+AddGUI.True+"    "+"error: "+AddGUI.False);
        }
    };

    public static void ResetOption(){
        pauseStart = programStart;
        pauseCount = 0;
        thread.stopped = true;
        label.setText(initial_Text);
        startPauseButton.setText("开始");
        AddGUI.label.setText("欢迎再次挑战     ");
        AddGUI.False=0;
        AddGUI.True=0;
        AddGUI.questions.setText("pass: "+AddGUI.True+"    "+"error: "+AddGUI.False);
    }

}