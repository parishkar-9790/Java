package Theory;

class A {
    public int parishkar() {
        return 24;
    }

    public void meth2() {
        System.out.println("this is a method 2 of class A");
    }
}

class B extends A {
    public void meth3() {
        System.out.println("This a method 3 of the class B");
    }

    @Override//this notation is used to say that this method is overiding the method of the superclass.....
    //why to write this overide this notation??
    //the benifit of this is that is tells that this method is overided and can be use full in big codes...
    public void meth2() {
        System.out.println("this is a method 2 of class B");
    }
}

public class c35methodoveridingjava {
    public static void main(String[] args) {
        B hey = new B();
        hey.meth2();
    }
}
