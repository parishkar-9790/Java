package SwingApps.byextendingletsee;

import javax.swing.*;

public class example2 extends JFrame {
JFrame f;
example2(){
    JButton b= new JButton("Click the example 2");
    b.setBounds(130,100,200,40);
    add(b);
    setSize(400,500);
    setLayout(null);
    setVisible(true);
}

    public static void main(String[] args) {
        new example2();
    }
}
