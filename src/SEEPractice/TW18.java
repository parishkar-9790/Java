// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

abstract class car {
    String carname, modelname;
    int chassinum;

    car(String carname, String modelname, int chassinum) {
        this.carname = carname;
        this.modelname = modelname;
        this.chassinum = chassinum;
    }

    abstract void startcar();

    abstract void operatecar();

    void display() {
        System.out.println("The car name is" + carname);
        System.out.println("The car model is" + modelname);
        System.out.println("The car chassinum is" + chassinum);
    }

}

class maruticar extends car {
    maruticar(String carname, String modelname, int chassinum) {
        super(carname, modelname, chassinum);
    }

    @Override
    void startcar() {
        System.out.println("the maruti started using key");
    }

    @Override
    void operatecar() {
        System.out.println("the car is slow and not so fun to drive");
    }
}

class bmw extends car {
    bmw(String carname, String modelname, int chassinum) {
        super(carname, modelname, chassinum);
    }

    @Override
    void startcar() {
        System.out.println("the bmw is started using button");
    }

    @Override
    void operatecar() {
        System.out.println("the car is very fast and fun to operate");
    }
}

class driver {
    String drivername, gender;
    int age;

    driver(String drivername, String gender, int age) {
        this.drivername = drivername;
        this.gender = gender;
        this.age = age;
    }

    void drivecar(car c) {
        System.out.println("the name of the driver is " + drivername);
        System.out.println("the gender of the driver is " + gender);
        System.out.println("the age of the driver is " + age);
        c.startcar();
        c.operatecar();
        c.display();
    }

}

public class TW18 {
    public static void main(String[] args) {

    }
}
