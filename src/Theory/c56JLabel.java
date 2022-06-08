package Theory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JLabel is a component for placing text in a container.It is used to display a single line of read only text. The text can be changed by an application but a user cannot edit it directly. It inherits JComponent Class
public class c56JLabel implements ActionListener {
    public static void main(String[] args) {
        JFrame hi=new JFrame("this is window");
        JLabel parishkar=new JLabel("this is label");
        JLabel parishkar2=new JLabel("this is second label");
        JTextField tf= new JTextField();
        JButton butt=new JButton("button");
        tf.setBounds(50,50,150,20);
        parishkar.setBounds(50,50,100,30);
        parishkar2.setBounds(50,100,100,30);
        butt.setBounds(50,200,100,30);
        hi.add(parishkar);
        hi.add(tf);
        hi.add(parishkar2);
        butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip="hey";

                tf.setText(ip);
            }
        });
        hi.add(butt);
        hi.setBounds(100,400,400,500);
        hi.setLayout(null);
        hi.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
