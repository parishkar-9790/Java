package AdditionalTermworks.termwork6;

import java.util.Scanner;

abstract class Account {
    Scanner read = new Scanner(System.in);
    static int accountnum = 100;
    String customerName;
    double balance;

    Account() {
        System.out.println("enter the name of the customer");
        customerName = read.next();
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

    abstract void deposit();

    abstract void withdraw();

    abstract void displayBal();

    abstract void fullaccountdetails();
}

class savingAccount extends Account {
    int depositNumber = 0;
    double depo;
    double wido;

    savingAccount() {
        super();
        System.out.println("initial balance is 10000 ");

        balance = 10000;
    }
    void deposit() {
        System.out.println("enter the amount to deposit");
        depo = read.nextInt();
        if (depo < 5000 && depositNumber <= 3) {
            super.balance = super.balance + depo;
            depositNumber++;
        } else
            System.out.println("error deposit less than 5000");

    }
    void withdraw() {
        System.out.println("enter the amount to withdraw");
        wido = read.nextInt();
        if (wido < balance && (balance - wido > 10000) && wido < 25000) {
            super.balance = super.balance - depo;
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
}
class currentAccount extends Account {
    int withdrawnum = 0;
    int depo;
    int wido;

    currentAccount() {
        super();
        balance = 25000;
        System.out.println("initial balance is 25000 ");
    }

    void deposit() {
        System.out.println("enter the amount to deposit");
        depo = read.nextInt();
        if (depo < 5000) {
            super.balance = super.balance + depo;

        } else
            System.out.println("error deposit less than 5000");

    }

    void withdraw() {
        System.out.println("enter the amount to withdraw");
        wido = read.nextInt();
        if ((balance - wido > -75000) && withdrawnum <= 2) {
            super.balance = super.balance - wido;
            withdrawnum++;
        } else
            System.out.println("error withdrawing money come after 24hr or check balance");
    }

    void displayBal() {
        System.out.println(balance);
    }

    void fullaccountdetails() {
        System.out.println("the name of the customer is " + customerName);
        System.out.println("the acccout number of the customer is " + accountnum);
        System.out.println("the balance of the customer is " + balance);
        System.out.println("the account type is Current ");
    }
}

public class termwork6d {
    public static void main(String[] args) {
//        currentAccount parishkar = new currentAccount();
//        parishkar.banking();
        savingAccount customer=new savingAccount();;
        customer.banking();
    }
}
