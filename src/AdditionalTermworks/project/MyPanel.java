package AdditionalTermworks.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JButton jcomp1;
    private JButton jcomp2;
    private JLabel jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JTextField jcomp6;
    private JTextField jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;

    public MyPanel() {
        JFrame frame = new JFrame("MyPanel");
        //construct components
        jcomp1 = new JButton("Deposit ");
        jcomp2 = new JButton("Withdraw");
        jcomp3 = new JLabel("Welcome to the Bank");
        jcomp4 = new JButton("Show Balance");
        jcomp5 = new JButton("Show Details ");
        jcomp6 = new JTextField(5);
        jcomp7 = new JTextField(5);
        jcomp8 = new JLabel("newLabel");
        jcomp9 = new JLabel("newLabel");
        frame.setSize(752, 425);
        setLayout(null);
        frame.add(jcomp1);
        frame.add(jcomp2);
        frame.add(jcomp3);
        frame.add(jcomp4);
        frame.add(jcomp5);
        frame.add(jcomp6);
        frame.add(jcomp7);
        frame.add(jcomp8);
        frame.add(jcomp9);

        jcomp1.setBounds(45, 60, 150, 50);
        jcomp2.setBounds(45, 145, 150, 50);
        jcomp3.setBounds(65, 10, 375, 25);
        jcomp4.setBounds(45, 225, 150, 50);
        jcomp5.setBounds(45, 305, 150, 50);
        jcomp6.setBounds(220, 80, 100, 25);
        jcomp7.setBounds(220, 155, 100, 25);
        jcomp8.setBounds(220, 230, 100, 25);
        jcomp9.setBounds(220, 315, 100, 25);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String ae = e.getActionCommand();
        switch (ae) {
            case "Deposit" -> {

            }
            case "Withdraw" -> {

            }
        }
    }
}
