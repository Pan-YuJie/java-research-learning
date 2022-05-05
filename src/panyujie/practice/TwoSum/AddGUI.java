package panyujie.practice.TwoSum;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.* ;  
public class AddGUI extends JFrame{

	public static  int True=0,False=0;
	public static JLabel label,questions;
	private JTextArea textArea1,textArea2;
	private String num1,num2;
    private JButton button;
    private JTextField textField3;
	private Random random=new Random();
	private PrintStream printOut=null;
	private PrintStream printOut2=null;

	public AddGUI(String string) throws FileNotFoundException {
		Font font = new Font("Arial Black",Font.BOLD,32);

		File f = new File("true.txt");
		File ff = new File("error.txt");
		OutputStream out = new FileOutputStream(f);
		OutputStream outt = new FileOutputStream(ff);
		printOut = new PrintStream(out);
		printOut2 = new PrintStream(outt);

		//设置标签组件
		Random r=new Random();
		textArea1 = new JTextArea(1,4);
		textArea2 = new JTextArea(1,4);
	    JLabel label1=new JLabel("+"); 
	    label1.setFont(font); 	
	    JLabel label2=new JLabel("=");
	    JLabel label3=new JLabel(" ");
	    label2.setFont(font);
	    label=new JLabel("欢迎做题      ");
	    label.setFont(new Font("MS Song", Font.PLAIN, 30));

	    questions=new JLabel("pass: "+True+"    "+"error: "+False);
		questions.setFont(new Font("Arial Black",Font.BOLD,20));
		//设置按钮组件;
		button = new JButton("YES"); 
		button.setFont(new Font("Arial Black",Font.BOLD,25));

		//设置textField组件 
		textField3 = new JTextField(4);
		textArea1.setFont(font);
		textArea2.setFont(font);
		textField3.setFont(font);

		textArea1.setEditable(false);
		textArea2.setEditable(false);

		num1=r.nextInt(100)+"";
		num2=r.nextInt(100)+"";
		textArea1.append(num1);
		textArea2.append(num2);

		//设置面板容器，并添加Button和TextField
		JPanel panel = new JPanel();
		JPanel panel2 =new JPanel();

		panel.setLayout(new FlowLayout());
		panel.add(textArea1);
		panel.add(label1);
		panel.add(textArea2);
		panel.add(label2);
		panel.add(textField3);
		panel.add(button);

		//将Panel加到Frame中，并设置Frame为可见
		this.setTitle(string);
		this.add(panel,"North");
		this.add(panel);
		panel2.add(label,"Westh");
		panel2.add(questions,"South");

		this.add(panel2,"South");
		setSize(700,150);
 	    this.setVisible(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        button.addActionListener(new A());

		textField3.setVisible(true);
		textField3.requestFocus();

		textField3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER)
				{
					Integer d1,d2,d3;
					d1=Integer.valueOf(textArea1.getText());
					d2=Integer.valueOf(textArea2.getText());
					try{
						d3=Integer.valueOf(textField3.getText());
						int tmp=0;
						tmp=(int) (d1+d2);
						if(tmp==d3)
						{
							True++;
							label.setForeground(Color.green);
							label.setText("计算正确     ");
							printOut.print( d1 + "  +  " + d2 +"  =  " + d3 +"\t\t√");
							printOut.println();
						}else{
							False++;
							label.setForeground(Color.red);
							label.setText("计算错误      ");
							printOut2.print( d1 + "  +  " + d2 +"  =  " + d3 +"\t\t×");
							printOut2.println();
						}
						textArea1.setText(random.nextInt(10)+"");
						textArea2.setText(random.nextInt(10)+"");
						textField3.setText("");
						questions.setText("pass: "+True+"    "+"error: "+False);
					}catch(Exception e1){
						label.setForeground(Color.red);
						textField3.setText("");
						label.setText("请输入正确格式答案！！   ");
					}
				}
			}
		});

   }
   
   class A implements ActionListener{ 
   	public void actionPerformed(ActionEvent e){ 
               Integer d1,d2,d3;
               d1=Integer.valueOf(textArea1.getText());
               d2=Integer.valueOf(textArea2.getText());
               	try{
					d3=Integer.valueOf(textField3.getText());
            	   int tmp=0;
            	   tmp=(int) (d1+d2);
            	   if(tmp==d3)
            	   {
					   True++;
					   label.setForeground(Color.green);
					   label.setText("计算正确     ");
					   printOut.print( d1 + "  +  " + d2 +"  =  " + d3 +"\t\t√");
					   printOut.println();
            	   }else{
            		   False++;
					   label.setForeground(Color.red);
					   label.setText("计算错误      ");
					   printOut2.print( d1 + "  +  " + d2 +"  =  " + d3 +"\t\t×");
					   printOut2.println();
            	   }
					textArea1.setText(random.nextInt(10)+"");
					textArea2.setText(random.nextInt(10)+"");
					textField3.setText("");
					questions.setText("pass: "+True+"    "+"error: "+False);
               }catch(Exception e1){
					label.setForeground(Color.red);
					label.setText("请输入答案！！     ");
               }
   		}
   }


}
