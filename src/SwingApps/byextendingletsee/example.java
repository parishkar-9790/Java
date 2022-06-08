package SwingApps.byextendingletsee;

import javax.swing.*;

public class example {
    JFrame f = new JFrame();

    example() {
        JButton b = new JButton("this is click");
        b.setBounds(130, 120, 100, 40);
        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new example();
    }
}
