package Theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class c54swings implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    public c54swings() {

        frame = new JFrame();
        button = new JButton("this is a button");
        label = new JLabel("number of clicks:-" + count);
        panel = new JPanel();
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("this is gui");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        c54swings hi = new c54swings();
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("\"number of clicks:-" + count);
    }
}
