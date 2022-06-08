package com.company;

class phone {
    public void name() {
        System.out.println("my name is Java");
    }

    public void override() {
        System.out.println("Phone Activated");
    }
}

class smart extends phone {
    public void welcome() {
        System.out.println("you are welcome here");
    }

    public void override() {
        System.out.println("Smart Phone has been activated");
    }
}


public class c29dynamicmethoddispatch {
    public static void main(String[] args) {
        phone oneplus = new smart();
        oneplus.name();
        oneplus.override();

    }
}
