// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Scanner;

class customerAccount {
    Scanner read = new Scanner(System.in);
    int accountNum;
    String customername;
    int balance;

    customerAccount(String name, int accountNum, int balance) {
        this.accountNum = accountNum;
        this.customername = customername;
        this.balance = balance;
    }

    void withdraw(int amt) {
        try {
            if (amt > balance)
                throw new insufficient("insufficient");
            balance = balance - amt;
            System.out.println("Amount withdrawn");
        } catch (insufficient e) {
            System.out.println(e.getMessage() + e);
        }
    }

    void deposit(int amt) {
        try {
            if (amt < 0)
                throw new invalidAmt("invalid amt");
        } catch (invalidAmt e) {
            System.out.println(e.getMessage() + e);
        }
    }

}

class insufficient extends Exception {
    insufficient(String s) {
        super(s);
    }

    public String toString() {
        return "Insufficient Balance";
    }
}

class invalidAmt extends Exception {
    invalidAmt(String s) {
        super(s);
    }

    public String toString() {
        return "Invalid Amt";
    }
}

public class TW24 {
    public static void main(String[] args) {

    }
}
