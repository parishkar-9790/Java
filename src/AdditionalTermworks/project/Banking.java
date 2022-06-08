package AdditionalTermworks.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class AccountX extends JFrame implements ActionListener {
    private JButton jcomp1;
    private JButton jcomp2;
    private JLabel jcomp3;
    Scanner read = new Scanner(System.in);
    static int accountnum = 100;
    String customerName;
    double balance;
    double depositX, withdrawX;

    AccountX() {
        JFrame frame = new JFrame("Accounting");

        JButton createAcc = new JButton("Create Account");
        JButton cont = new JButton("Continue Banking");
        jcomp3 = new JLabel("Welcome to the Bank");

        createAcc.addActionListener(this);
        cont.addActionListener(this);


        frame.setSize(1200, 800);
        frame.setLayout(null);

        frame.add(createAcc);
        frame.add(cont);
        frame.add(jcomp3);

        createAcc.setBounds(220, 175, 150, 50);
        cont.setBounds(390, 175, 150, 50);
        jcomp3.setBounds(325, 40, 375, 25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void AccountXenterCustomer() {
        System.out.println("enter the name of the customer");
        customerName = read.next();
        System.out.println("enter the name balance of the customer");
        balance = read.nextInt();
        accountnum++;

    }


    void banking() {
        int choice;
        do {
            System.out.println("1.deposit 2.withdraw 3.displayBalance 4.full details");
            choice = read.nextInt();
            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> displayBal();
                case 4 -> fullaccountdetails();
            }
        } while (choice != 5);
    }

    void deposit() {
        System.out.println("enter the amount to deposit");
        depositX = read.nextInt();
        balance = balance + depositX;
    }

    void withdraw() {
        System.out.println("enter the amount to withdraw");
        withdrawX = read.nextInt();
        if (withdrawX <= balance) {
            balance = balance - withdrawX;
        } else
            System.out.println("error withdrawing");
    }

    void displayBal() {

        System.out.println(balance);
    }

    void fullaccountdetails() {
        System.out.println("the name of the customer is " + customerName);
        System.out.println("the acccout number of the customer is " + accountnum);
        System.out.println("the balance of the customer is " + balance);
        System.out.println("the account type is Saving ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ae = e.getActionCommand();
        switch (ae) {
            case "Create Account" -> {

            }
            case "Continue Banking" -> {
                new MyPanel();
            }

        }
    }
}

public class Banking {
    public static void main(String[] args) {
        AccountX parishkar = new AccountX();

    }
}
