package Theory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class c58JTextCalc implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    c58JTextCalc() {
        JFrame F = new JFrame("this is a new frame");
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(100, 200, 50, 50);
        F.setSize(500, 500);
        b1.addActionListener(this);
        b2.addActionListener(this);
        F.add(tf1);
        F.add(tf2);
        F.add(tf3);
        F.add(b1);
        F.add(b2);
        F.setLayout(null);
        F.setVisible(true);


    }

    public static void main(String[] args) {
        new c58JTextCalc();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1), b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else
            c = a - b;
        String result = String.valueOf(c);
        tf3.setText(result);
    }
}
