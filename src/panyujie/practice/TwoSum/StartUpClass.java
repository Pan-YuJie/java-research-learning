package panyujie.practice.TwoSum;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Submerge
 * Date: 2022-05-05
 * Time: 9:14
 */
public class StartUpClass {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Timer frame = new Timer("计时");
        frame.pack();
        frame.setVisible(true);
        AddGUI addGUI=new AddGUI("两个数相加 （ 限时100s ）");
    }
}
