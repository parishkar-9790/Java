package termwork4;

class employeeJ {
    String name, address, gender;
    int age;
    double salary;

    employeeJ(String name, String address, String gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    void display() {
        System.out.println("the name of them employee is " + name);
        System.out.println("the address of the employee is " + address);
        System.out.println("the gender of the employee is " + gender);
        System.out.println("the age of the employee is " + age);
    }
}

class fullTime extends employeeJ {
    int basicsalary;

    fullTime(String name, String address, String gender, int age, int basicsalary) {
        super(name, address, gender, age);
        this.basicsalary = basicsalary;
    }

    void computeSalary() {
        System.out.println("the salary is " + ((basicsalary * .75) + 0.075 * (basicsalary) + (basicsalary) * .10));
    }

}

class partTime extends employeeJ {
    String qualification;
    int exp, hours;

    partTime(String name, String address, String gender, int age, String qualification, int exp, int hours) {
        super(name, address, gender, age);
        this.qualification = qualification;
        this.exp = exp;
        this.hours = hours;
    }

    void computeSalary() {
        switch (qualification) {
            case "BE":
                if (exp >= 1 && exp <= 5)
                    salary = 300;
                if (exp >= 6 && exp <= 10)
                    salary = 500;
                if (exp > 10)
                    salary = 800;
                break;
            case "Mtech":
                if (exp >= 1 && exp <= 5)
                    salary = 400;

                else if (exp >= 6 && exp <= 10)
                    salary = 700;
                else
                    salary = 1200;
                break;
            case "PHD":
                if (exp >= 1 && exp <= 5)
                    salary = 500;
                else if (exp >= 6 && exp <= 10)
                    salary = 1000;
                else
                    salary = 1500;
                break;

        }
        salary = salary * hours;
        System.out.println("the salary of the part time is " + salary);
    }
}

public class employee {
    public static void main(String[] args) {
        partTime p1 = new partTime("adam", "home", "male", 20, "BE", 4, 10);
        p1.display();
        p1.computeSalary();
        System.out.println("\n");
        fullTime f1 = new fullTime("chris", "home2", "male", 40, 10000);
        System.out.println("\n");
        f1.display();
        f1.computeSalary();
    }

}
