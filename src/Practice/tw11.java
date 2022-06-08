
package Practice;
import java.util.*;
class Employeee{
    String name;
    String address;
    int date, month, year;
    double salary;
    String designation;

    Employeee(String n,String ad,int d, int m,int y, double s,String designation){
        name=n;
        address=ad;
        date=d;
        month=m;
        year=y;
        salary=s;
        this.designation=designation;
    }

    void reportForDuty(){
        System.out.println("Welcome, Dear Employee!");
        System.out.println("Reporting time: 23:11");
        System.out.println("Reporting Date: 23/03/2022");
    }
}
class Doctor extends Employeee{
    String expertise;
    int yearsOfEXperience;
    Doctor(String n, String ad, int d, int m, int y, double s, String designation,String exp,int yOfE) {
        super(n, ad, d, m, y, s, designation);
        expertise=exp;
        yearsOfEXperience=yOfE;
    }

    void performDuty(){
        expertise=expertise.toUpperCase();
        switch(expertise){
            case "Surgeon": if(yearsOfEXperience>=10)
                                System.out.println("Perform Heart Operation.");
                            else
                                System.out.println("Perform MInor Operation.");

           case "Orthopedic":   if(yearsOfEXperience>5)
                                     System.out.println("Perform Surgery and Plastering");
                                else
                                     System.out.println("Perform Platering");
        }
    }
}
class Nurse extends Employeee{
    String expertise;
    int yearsOfEXperience;
    Nurse(String n, String ad, int d, int m, int y, double s, String designation,int yOfE) {
        super(n, ad, d, m, y, s, designation);
        yearsOfEXperience=yOfE;
    }
    void performDuty(){
        if(yearsOfEXperience>3){
            System.out.println("Check BP and Sugar.");
            System.out.println("Administer Medicine.");
        }else
        {
            System.out.println("Look after vitals and status.");
        }
    }
}
public class tw11 {
    static void generateReport(Employeee e){
        System.out.println("Name: "+e.name);
        System.out.println("Address: "+e.address);
        System.out.println("Date Of Birth: "+e.date+"/"+e.month+"/"+e.year);
        System.out.println("Salary: "+e.salary);
        System.out.println("Designation: "+e.designation);

    }
    public static void main(String[] args) {

        Doctor d1=new Doctor("Rachita","Ganeshpur",27,03,2002,50000,"Doctor","Surgeon",12);
//        d1.reportForDuty();
        tw11.generateReport(d1);
        d1.performDuty();

        System.out.println();

        Doctor d2=new Doctor("Suprita","Ganeshpur",12,02,1998,25000,"Doctor","Surgeon",5);
        d2.reportForDuty();
        tw11.generateReport(d2);
        d2.performDuty();

        System.out.println();

        Doctor d3=new Doctor("Shradha","Mahantesh Nagar",22,02,2002,30000,"Doctor","Orthopedic",5);
        d3.reportForDuty();
        tw11.generateReport(d3);
        d3.performDuty();

        System.out.println();

        Doctor d4=new Doctor("Sahana","Hanuman Nagar",03,03,2002,15000,"Doctor","Orthopedic",2);
        d4.reportForDuty();
        tw11.generateReport(d4);
        d4.performDuty();

        System.out.println();

        Nurse n1=new Nurse("Rita","SadashivNagar",22,07,2000,20000,"Nurse",10);
        n1.reportForDuty();
        tw11.generateReport(n1);
        n1.performDuty();

        System.out.println();

        Nurse n2=new Nurse("Vita","SadashivNagar",20,07,2002,10000,"Nurse",2);
        n1.reportForDuty();
        tw11.generateReport(n1);
        n1.performDuty();

        System.out.println();



    }


}
