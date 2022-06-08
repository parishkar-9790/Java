package com.company;

interface cycle {
    int a = 45;

    //    we can also write final a;
    void applybrake(int decrement);

    void speedup(int increment);
}

interface horn {

    void blowhorn();

    void dontblow();
}

class herocycle implements cycle, horn {
    public void applybrake(int decrement) {
        System.out.println("stopping now");
    }

    public void speedup(int increment) {
        System.out.println("applying speedup");
    }

    public void blowhorn() {
        System.out.println("horn is blowing");
    }

    public void dontblow() {
        System.out.println("i am not blowing the horn");
    }

    ;
}

public class c43interfaces {
    public static void main(String[] args) {
        herocycle cyclep = new herocycle();
        cyclep.applybrake(1);
//        you can create properties in interfaces
        System.out.println(cyclep.a);
//        you cannot modify the properties in interfaces as they final
//        a is final and we cannot change it
        cyclep.blowhorn();
        cyclep.dontblow();
    }
}
