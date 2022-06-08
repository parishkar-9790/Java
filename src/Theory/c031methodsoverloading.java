package com.company;

public class c031methodsoverloading {
    static void foo() {
        System.out.println("good morning bro:");
    }

    static void foo(int a) {
        System.out.println("good morning bro:" + a);
    }

    static void foo(int a, int b ) {
        System.out.println("good morning bro: i love you :" + a);
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int a[]) {
        a[0] = 98;
    }

    static void telljoke() {
        System.out.println("i invented a new word \n");
        System.out.println("\n plagarism!");

    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;

    }
//hey there today i got  new keyboard

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
//        method invocation using object orientation
        c = logic(a, b);
        System.out.println(a + " " + b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
//        telljoke();
//    int x =45;
//    change(x);
//        System.out.println(x);
//    case 1 changing the the array
        int marks[] = {52, 543, 77, 89, 98, 94};
        change2(marks);
        System.out.println("the value of the array" + marks[0]);
        foo();
        foo(3000);
        foo(3000,4000);
//        argument are actual
//        being a software engineer you need technical knowledge about everthing going on
    }
}
