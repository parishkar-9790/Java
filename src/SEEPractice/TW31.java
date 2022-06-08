package SEEPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TW31 extends JFrame implements ActionListener {
    private JSlider LoanAmount;
    private JTextField jtfAnnualInterestRate;
    private JSlider NumberOfYears;
    private JTextField emi;
    private JButton jbtCompute;
    private JButton jbtReset;
    private JTextField name;
    private JLabel custout;

    public TW31() {

        setTitle("Loan Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
//        setLocationRelativeTo(null);
        setLayout(new GridLayout(10, 10, 5, 5));
        JLabel custname = new JLabel("Customer Name");
        custout = new JLabel();
        JLabel jlInvestmentAmount = new JLabel(" Investment Amount");
        JLabel jlNumberOfYears = new JLabel(" Number of Years");
        JLabel jlAnnualInterestRate = new JLabel(" Annual Interest Rate");
        JLabel emival = new JLabel("EMI");

        LoanAmount = new JSlider(5, 95, 5);
        LoanAmount.setMinorTickSpacing(5);
        LoanAmount.setMajorTickSpacing(20);
        LoanAmount.setPaintTicks(true);
        LoanAmount.setPaintLabels(true);
        name = new JTextField();
        NumberOfYears = new JSlider(5, 30, 5);
        NumberOfYears.setMinorTickSpacing(1);
        NumberOfYears.setMajorTickSpacing(5);
        NumberOfYears.setPaintTicks(true);
        NumberOfYears.setPaintLabels(true);
        jtfAnnualInterestRate = new JTextField();

        emi = new JTextField();
        emi.setEditable(false);

        jbtCompute = new JButton("Compute");
        jbtReset = new JButton("Reset");

        add(custname);
        add(name);
        add(jlInvestmentAmount);
        add(LoanAmount);
        add(jlNumberOfYears);
        add(NumberOfYears);
        add(jlAnnualInterestRate);
        add(jtfAnnualInterestRate);
        add(emival);
//        add(emi);
        add(jbtCompute);
        add(jbtReset);
        add(custout);
        jbtCompute.addActionListener(this);
        jbtReset.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TW31();
    }

    private void computeValue() {
        try {
            String cname = name.getText();
            double annualInterestRate = Double.parseDouble(jtfAnnualInterestRate.getText());
            double monthlyInterestRate = annualInterestRate / 1200.0;
            int NumberOfYears = this.NumberOfYears.getValue();
            double investmentAmount = LoanAmount.getValue();
            double EMI = investmentAmount * Math.pow(1.0 + monthlyInterestRate, NumberOfYears * 12);
            custout.setText("Hello " + cname + ", your interest amount is: " + EMI);
//            emi.setText(String.format("%.2f", EMI));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please enter numeric values.");
        }
    }

    private void resetForm() {
        LoanAmount.setValue(0);
        jtfAnnualInterestRate.setText("");
        NumberOfYears.setValue(0);
        emi.setText("");
        custout.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtCompute) {
            computeValue();
        }
        if (e.getSource() == jbtReset) {
            resetForm();
        }


    }
}
