package Theory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The JButton is used to create a labelled button that has platform independent implimentation
// https://www.javatpoint.com/java-jbutton
public class c55JButton extends AbstractButton implements ActionListener {
    public static void main(String[] args) {
        JFrame f = new JFrame("Click");
        JButton b = new JButton("Update");
        JButton bimg=new JButton(new ImageIcon("D:\\PARISHKAR\\psr.jpg"));
        final JTextField tf=new JTextField();
        tf.setBounds(50,100,95,30);
        b.setBounds(100, 200, 95, 30);
        bimg.setBounds(100,300,100,50);
        f.add(b);
        f.add(bimg);
        f.setSize(400, 400);
        f.setLayout(null);
        f.add(tf);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to the action listener Example by Parishkar Singh ");
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
