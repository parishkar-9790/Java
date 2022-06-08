package com.company;

import java.util.Scanner;
class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }

}
class rectangle {
    int side1;
    int side2;

    public int perimeter() {
        return 2 * (side1 + side2);
    }

    public int area() {
        return (side1 * side2);
    }
}

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Employee1 {
    int id, salary;
    String name;
    Scanner cin = new Scanner(System.in);

    public void printdetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my salary is  " + salary);
    }

    public int setSalary() {
        System.out.println("enter the salary");
        salary = cin.nextInt();
        return salary;
    }

    public String setName() {
        System.out.println("enter the name");
        name = cin.next();
        return name;
    }

    public void getName(String n) {
        name = n;
    }

    public void printDetails() {
        System.out.println("the name of the employee is " + name);
        System.out.println("the salary of the employee is " + salary);
    }
}

class cellphone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }

    public void callFriend() {
        System.out.println("calling parishkar");
    }

    public void silent() {
        System.out.println("silent....");
    }
}

public class c39questionoops {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //     problem 1 gg
        Employee1 one = new Employee1();
        one.setName();
        one.setSalary();
        one.printDetails();
//      problem 2
        cellphone asus = new cellphone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();
//      problem 3
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
//      problem 4
        rectangle rect = new rectangle();
        System.out.println("enter the side 1");
        rect.side1 = cin.nextInt();
        System.out.println("enter the side 2");
        rect.side2 = cin.nextInt();
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
//        vice city tommy vercetti
        tommy player1=new tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
