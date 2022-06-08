// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Date;

class employee {
    static int count = 1;
    String name, dob, address, designation;
    int salary, idcardno;
    Date report = new Date();

    employee(String name, String address, String dob, int salary, String designation) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
        idcardno = count++;
    }

    void reportforduty() {
        System.out.println("Welcome " + designation);
        System.out.println("Reporting Time is" + report.toString());
        System.out.println();
    }


}

class doctor extends employee {
    int yearsofexp;
    String expertise;

    doctor(String name, String address, String dob, int salary, String designation, int yearsofexp, String expertise) {
        super(name, address, dob, salary, designation);
        this.yearsofexp = yearsofexp;
        this.expertise = expertise;
    }

    void performduty() {
        System.out.print("Doctore will ");
        if (expertise.equals("surgeon")) {
            if (yearsofexp > 10)
                System.out.println("Perform Heart Operation");
            else
                System.out.println("Perform Minor Surgery");
        } else if (expertise.equals("orthopedic")) {
            if (yearsofexp > 5)
                System.out.println("Perform surgery and plaster");
            else
                System.out.println("plastering");
        }
        System.out.println();
    }
}

class nurse extends employee {

    int yearsofexp;
    String expertise;

    nurse(String name, String address, String dob, int salary, String designation, int yearsofexp, String expertise) {
        super(name, address, dob, salary, designation);
        this.yearsofexp = yearsofexp;
        this.expertise = expertise;
    }

    void performduty() {
        System.out.print("Nurse will ");
        if (yearsofexp > 3)
            System.out.println("check bp and sugar");
        else System.out.println("sit and look at the patient");
    }
}


public class TW11 {
    static void generatereport(employee e) {
        System.out.format("%d %s %14s %14s %14d %14s", e.idcardno, e.name, e.address, e.dob, e.salary, e.designation);
        System.out.println();
    }

    public static void main(String[] args) {
        employee eve = new employee("eve", "heaven", "19/1/0000", 10000, "firstwoman");
        doctor rrr = new doctor("rrr", "hostital", "20/10/1965", 100000, "Senior Doctor", 11, "surgeon");
        rrr.reportforduty();
        rrr.performduty();
        nurse nnn = new nurse("nnn", "hospital room", "10/10/1985", 40000, "nurse", 4, "nurse");
        nnn.reportforduty();
        nnn.performduty();
        generatereport(eve);
        generatereport(rrr);
        generatereport(nnn);
    }
}
