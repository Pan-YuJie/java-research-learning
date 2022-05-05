package panyujie.practice.TwoSum;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tips extends JFrame {
	JButton button;
	Label label, label1;
	JPanel panel;
	JPanel panel2;

	public tips(String s1) {
		panel = new JPanel();
		panel2 = new JPanel();
		button = new JButton("YES");

		this.setTitle("提示");
		Font font = new Font("MS Song", Font.PLAIN, 30);

		label = new Label(s1);
		label1 = new Label("   pass: "+AddGUI.True+"    "+"error: "+AddGUI.False);
		label.setFont(new Font("Arial Black", Font.BOLD, 30));
		label1.setFont(new Font("Arial Black", Font.BOLD, 20));

		panel2.add(button);
		panel.setLayout(new GridLayout(2, 0));

		setLocationRelativeTo(null);
		panel.add(label);
		panel.add(panel2);
		panel.add(label1);
		this.add(panel, "South");
		button.addActionListener(new B());

		setSize(300, 200);
		this.pack();
		this.setVisible(true);

		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					dispose();
					//Timer.ResetOption();
				}
			}
		});
	}

	class B implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	public static void main(String[] args) {
		new tips("  time runs out");
	}

}
