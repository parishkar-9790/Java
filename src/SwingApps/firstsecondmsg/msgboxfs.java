package SwingApps.firstsecondmsg;

import javax.swing.*;

public class msgboxfs {
    JFrame frame;
    msgboxfs() {
        frame = new JFrame("first way");
        JButton button = new JButton("lets see");
        button.setBounds(200, 150, 90, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        msgboxfs parishkar=new msgboxfs();
    }


}
