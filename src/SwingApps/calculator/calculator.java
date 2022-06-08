package SwingApps.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField l;
    String s0, s1, s2;

    calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        f = new JFrame("CALCULATOR");
        calculator c = new calculator();
        l = new JTextField(16);
        l.setEditable(false);
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bdec, bclear;
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bdec = new JButton(".");
        bclear = new JButton("C");
        JPanel p = new JPanel();
        b0.addActionListener(c);
        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        badd.addActionListener(c);
        bsub.addActionListener(c);
        bmul.addActionListener(c);
        bdiv.addActionListener(c);
        beq.addActionListener(c);
        bdec.addActionListener(c);
        bclear.addActionListener(c);
        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bdec);
        p.add(bdiv);
        p.add(bmul);
        p.add(bclear);
        p.setBackground(Color.white);
        f.add(p);
        f.setVisible(true);
        p.setVisible(true);
        f.setSize(200, 220);
//        f.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ((s.charAt(0) > '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            l.setText(s0+s1+s2);
        }

    }
}
