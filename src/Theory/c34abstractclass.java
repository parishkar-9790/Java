package Theory;

abstract class Base2 {
    public Base2() {
        System.out.println("This is the constructor of base 2 class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class derived2 extends Base2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class derived3 extends Base2 {
    public void th() {
        System.out.println("I am good");
    }
}

public class c34abstractclass {
    public static void main(String[] args) {
     derived2 d2=new derived2();

    }
}
