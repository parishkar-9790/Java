package Termworks.termwork10;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class tw10 extends JFrame implements ActionListener {
    JTextField num1, num2, result;
    JLabel lb1, lb2, lb3;
    JButton b1, b2, b3, b4;
    tw10() {
        this.setTitle("My Second GUI");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lb1 = new JLabel("First Number");
        lb1.setBounds(100, 30, 100, 30);
        this.add(lb1);
        num1 = new JTextField("");
        num1.setBounds(205, 30, 90, 30);
        this.add(num1);
        lb2 = new JLabel("Second Number");
        lb2.setBounds(100, 70, 100, 30);
        this.add(lb2);
        num2 = new JTextField("");
        num2.setBounds(205, 70, 90, 30);
        this.add(num2);

        b1 = new JButton("Add");
        b1.setBounds(120, 120, 120, 30);
        this.add(b1);

        b2 = new JButton("Subtract");
        b2.setBounds(250, 120, 120, 30);
        this.add(b2);
        b2.addActionListener(this);

        lb3 = new JLabel("Result is");
        lb3.setBounds(100, 170, 100, 30);
        this.add(lb3);

        result = new JTextField("");
        result.setBounds(205, 170, 90, 30);
        result.setEditable(false);
        this.add(result);

        b1.addActionListener(this);
        b3 = new JButton("Multiply");
        b3.setBounds(380, 120, 120, 30);
        this.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("Divide");
        b4.setBounds(510, 120, 120, 30);
        this.add(b4);
        b4.addActionListener(this);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        if(e.getActionCommand() == "Add") {
            int sum = a + b;
            result.setText("" + sum);
        }
        else if(e.getActionCommand() == "Subtract") {
            int diff = a - b;
            result.setText("" + diff);
        }
        else if(e.getActionCommand() == "Multiply") {
            int prod = a * b;
            result.setText("" + prod);
        }
        else {
            try {
                int res = a / b;
                result.setText("" + res);
            }
            catch(ArithmeticException e1) {
                result.setText("Illegal division");
            }
        }
    }
    public static void main(String[] args) {
        new tw10();
    }
}
