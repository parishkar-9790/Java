package Practice;

abstract class parent {
    void message() {
        System.out.println("this is a method of the parent class");
    }
}

class first extends parent {
    @Override
    public void message() {
        System.out.println("this is message of the first sub class");
    }
}

class second extends parent {
    @Override
    public void message() {
        System.out.println("this is message of the second sub class");
    }
}

public class abstractpractice {
    public static void main(String[] args) {
        first f = new first();
        second s = new second();
        f.message();
        s.message();
    }
}
