package SwingApps.byextendingletsee;

import javax.swing.*;

public class test2 extends JFrame {
    JFrame frame;

    test2() {
        setTitle("this is made using inhertance method ");
        JButton button = new JButton("Click");
        button.setBounds(165, 135, 115, 55);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test2();
    }

}
