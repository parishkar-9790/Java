package AdditionalTermworks.termwork8;
import java.util.Scanner;
class CustomerAccount{ // class CustomerAccount is created
    int accNo;
    String custName;
    double balance;// required variables are initialised
    CustomerAccount(int accNo,String custName,double balance)// constructor of the class
    {
        this.accNo = accNo;
        this.custName = custName;
        this.balance = balance;
        // variables are initialied in the constructor
    }
    void withdrawAmt(double Amt) // method used to withdraw the amount
    {
        try{// try block to check for exception when the amt is withdrawn
            if(balance-Amt <0)
                throw new InsufficientBalException("Insufficient Balance");
            balance-=Amt;
            System.out.println("Balance in the account is "+ balance);
        }
        catch (InsufficientBalException e) // catch block to deal with the insufficient Balance Exception
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println();
        }
    }
    void depositAmt(double Amt) // method used to deposit the amount
    {
        try // try block to check for exception while depositing the amount
        {
            if(Amt<0)
                throw new InvalidAmtException("Invalid amount");
            balance+=Amt;
            System.out.println("Balance in the account is "+ balance);
        }
        catch( InvalidAmtException e) // catch block to deal with the invalid amount exception
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println();
        }
    }
}
class InsufficientBalException extends Exception{ /* subclass insufficientBalException is extending
superclass Exception*/
    InsufficientBalException(String msg)
    {
        super(msg);
    }
    public String toString()// toString method is overrided
    {
        return "Amount can't be withdrawm as there is insufficient Balance";
    }
}
class InvalidAmtException extends Exception{/* subclass invalidAmtException is extending
superclass Exception*/
    InvalidAmtException(String msg)
    {
        super(msg);
    }
    public String toString()// toString method is overrided
    {
        return "Can't deposit as amount is negative";
    }
}
public class termwork8 {
    public static void main(String[] args) {
        CustomerAccount c =new CustomerAccount(101,"Amit shah",1000);/*object is instantiated of the
class CustomerAccount */
        c.depositAmt(-500);// depositAmt method is called
        c.withdrawAmt(1200);// withdrawAmt method is called
        c.depositAmt(1500);
        c.withdrawAmt(1000);
    }
}
