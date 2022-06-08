package SEEPractice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class TW30 extends javax.swing.JFrame {
    class StudentRecord {
        String name;
        int rollNo, m1, m2, m3;

        StudentRecord(int rollNo, String name, int m1, int m2, int m3) {
            this.name = name;
            this.rollNo = rollNo;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
    }

    ArrayList<StudentRecord> records = new ArrayList<StudentRecord>();
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                TW30 window = new TW30();
                window.frame.setVisible(true);

            }
        });
    }


    public TW30() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel jbl1 = new JLabel("Roll No");
        jbl1.setBounds(10, 10, 50, 30);
        frame.add(jbl1);

        textField = new JTextField();
        textField.setBounds(65, 10, 50, 30);
        frame.add(textField);
        textField.setColumns(10);

        JLabel jbl2 = new JLabel("Name");
        jbl2.setBounds(10, 50, 50, 30);
        frame.add(jbl2);

        textField_1 = new JTextField();
        textField_1.setBounds(65, 50, 50, 30);
        frame.add(textField_1);
        textField_1.setColumns(10);

        JLabel jbl3 = new JLabel("Marks-1");
        jbl3.setBounds(10, 90, 50, 30);
        frame.add(jbl3);

        textField_2 = new JTextField();
        textField_2.setBounds(65, 90, 50, 30);
        frame.add(textField_2);
        textField_2.setColumns(10);

        JLabel jbl4 = new JLabel("Marks-2");
        jbl4.setBounds(10, 130, 50, 30);
        frame.add(jbl4);

        textField_3 = new JTextField();
        textField_3.setBounds(65, 130, 50, 30);
        frame.add(textField_3);
        textField_3.setColumns(10);

        JLabel jbl5 = new JLabel("Marks-3");
        jbl5.setBounds(10, 170, 50, 30);
        frame.add(jbl5);

        textField_4 = new JTextField();
        textField_4.setBounds(65, 170, 50, 30);
        frame.add(textField_4);
        textField_4.setColumns(10);
        JButton b1 = new JButton("Add");
        b1.setBounds(20, 210, 60, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentRecord s1 = new StudentRecord(Integer.parseInt(textField.getText()), textField_1.getText(), Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()));
                records.add(s1);
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
            }
        });

        frame.add(b1);
        JButton b2 = new JButton("Summarize");
        b2.setBounds(90, 210, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int rowCount = 0;
                for (StudentRecord s : records) {
                    table.setValueAt(s.rollNo, rowCount, 0);
                    table.setValueAt(s.name, rowCount, 1);
                    table.setValueAt(s.m1, rowCount, 2);
                    table.setValueAt(s.m2, rowCount, 3);
                    table.setValueAt(s.m3, rowCount, 4);
                    float avg = (s.m1 + s.m2 + s.m3) / 3.0f;
                    table.setValueAt(String.format("%.2f", avg), rowCount, 5);
                    rowCount++;
                }
            }
        });

        frame.add(b2);
        table = new JTable();
        table.setBounds(170, 30, 230, 180);
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                },
                new String[]{
                        "Roll No", "Name", "Marks 1", "Marks 2", "Marks 3", "Average"
                }
        ));
        frame.add(table);
    }
}