package AdditionalTermworks.termwork7;

interface IAnimal {
    void walk();

    void sleep();
}

interface IBird {
    void fly();

    void peek();
}

interface IHuman {
    void eat();

    void speak();

}

class bird implements IAnimal, IBird {
    public void walk() {
        System.out.println("the bird can walk");
    }

    public void sleep() {
        System.out.println("the bird can sleep");
    }

    public void fly() {
        System.out.println("the bird can fly");
    }

    public void peek() {
        System.out.println("the bird can peck");
    }
}

class human implements IAnimal, IHuman {
    public void walk() {
        System.out.println("the human can walking");
    }

    public void sleep() {
        System.out.println("the human is sleeping ");
    }

    public void speak() {
        System.out.println("the human speaks ");
    }

    public void eat() {
        System.out.println("the human eats");
    }
}

public class animal {
    public static void main(String[] args) {
    human parishkar=new human();
    parishkar.eat();
    parishkar.speak();
    parishkar.sleep();
    parishkar.walk();
    }
}
