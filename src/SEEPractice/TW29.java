package SEEPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TW29 extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3;
    JTextField num1, num2, num3;
    JButton b1, b2, b3, b4;

    TW29() {
        this.setTitle("This is GUI Calculator");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lb1 = new JLabel("First Number: ");
        lb2 = new JLabel("Second Number: ");
        lb3 = new JLabel("The Result is: ");
        lb1.setBounds(60, 100, 110, 30);
        lb2.setBounds(60, 140, 110, 30);
        lb3.setBounds(100, 300, 110, 30);
        num1 = new JTextField();
        num1.setBounds(160, 100, 110, 30);
        num2 = new JTextField();
        num2.setBounds(160, 140, 110, 30);
        num3 = new JTextField();
        num3.setBounds(200, 300, 110, 30);
        this.add(lb1);
        this.add(lb3);
        this.add(lb2);
        this.add(num1);
        this.add(num2);
        this.add(num3);
        b1 = new JButton("ADD");
        b1.setBounds(100, 200, 100, 30);
        b1.addActionListener(this);
        b2 = new JButton("SUB");
        b2.setBounds(220, 200, 100, 30);
        b2.addActionListener(this);
        b3 = new JButton("DIV");
        b3.setBounds(160, 250, 100, 30);
        b3.addActionListener(this);
        b4 = new JButton("MUL");
        b4.setBounds(280, 250, 100, 30);
        b4.addActionListener(this);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int res;
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        switch (e.getActionCommand()) {
            case "ADD": {
                res = a + b;
                num3.setText("" + res);
                break;
            }
            case "SUB": {
                res = a - b;
                num3.setText("" + res);
                break;
            }
            case "MUL": {
                res = a * b;
                num3.setText("" + res);
                break;
            }
            case "DIV": {
                try {
                    res = a / b;
                    num3.setText("" + res);
                    break;
                } catch (ArithmeticException ae) {
                    num3.setText(" " + ae);
                }
            }
        }
    }

    public static void main(String[] args) {
        new TW29();
    }
}
