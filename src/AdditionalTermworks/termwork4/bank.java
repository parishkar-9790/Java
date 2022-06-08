import java.util.*;
class Bank
{
    protected String name;
    protected double balance;
    protected int accountNumber;
    protected float inamt;
    Bank( String name,double balance, int accountNumber , float inamt)
    {
        this.balance=balance;
        this.name=name;
        this.accountNumber=accountNumber;
        this.inamt=inamt;
    }
    void disp()
    {
        System.out.println("Account holder:"+name+"\nAccount number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }

}
interface interest
{
    float getRateofInterest(int t);
}
class SBI extends Bank implements interest
{
    SBI(String name,double balance, int accountNumber , float r)
    {
        super(name,balance,accountNumber ,r);
    }
    public float getRateofInterest(int t)
    {
        return (float)(inamt/(balance*t)*100);
    }
}
class icici extends Bank implements interest
{
    icici(String name,double balance, int accountNumber ,float inamt)
    {
        super(name,balance,accountNumber ,inamt);
    }
    public float getRateofInterest(int t)
    {
        return (float)(inamt/(balance*t)*100);
    }
}
class Axis extends Bank implements interest
{
    Axis(String name,double balance, int accountNumber , float inamt)
    {
        super(name,balance,accountNumber ,inamt);
    }
    public float getRateofInterest(int t)
    {
        return (float)(inamt/(balance*t)*100);
    }
}
class Main
{
    public static void main(String args[])
    {
        SBI s=new SBI("Hozier",45100,123,2500);
        s.disp();
        System.out.println("Rate of interst is "+s.getRateofInterest(3)+"%\n");
        Axis a=new Axis("Harry",28000,12,1500);
        a.disp();
        System.out.println("Rate of interst is "+a.getRateofInterest(2)+"%\n");
        icici i=new icici("Louis",29000,24,1800);
        i.disp();
        System.out.println("Rate of interst is "+i.getRateofInterest(5)+"%\n");
    }
}
