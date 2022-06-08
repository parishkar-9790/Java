//abstract class Pen {
//    abstract void write();
//
//    abstract void refill();
//}
//
//class fountainPen extends Pen {
//    void refill() {
//        System.out.println("refilling");
//    }
//
//    void write() {
//        System.out.println("writing");
//    }
//
//    void changenib() {
//        System.out.println("changing the nib");
//    }
//
//}
class monkey {
    void jump() {
        System.out.println("jumping");
    }

    void bite() {
        System.out.println("biting");
    }
}

interface basicanimalinterface {
    void eat();

    void sleep();
}

class human extends monkey implements basicanimalinterface {
    void speak() {
        System.out.println("Hello sir");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class c46interfacepractice {
    public static void main(String[] args) {
//        fountainPen pen = new fountainPen();
//        pen.changenib();
//        pen.refill();
//        pen.write();
//        q2;
        human parishkar = new human();
        parishkar.sleep();
//        QUESTION 5
        monkey m1 = new human();
        m1.bite();
//          m1.speak(); cause monkey cant speak
        basicanimalinterface par=new human();
        par.eat();
//        par.speak();cause he's too lazy

    }
}
