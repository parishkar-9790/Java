package com.company;

class base {
    int x;

    public int getX() {
        return x;
    }

    // alt + insert let you make getting
    public void setX(int x) {
        System.out.println("i am setting now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("i am a constructor");
    }
}

class derived extends base {
    public int y;

    public int getY() {
        return y;
    }
    public void setY(int z) {
        y = z;
    }
}

public class c41inheritance {
    public static void main(String[] args) {
//      creating an object of the base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

//        Creating an object of derived class
        derived d = new derived();
        d.setX(4);
        System.out.println(b.getX());

    }
}
