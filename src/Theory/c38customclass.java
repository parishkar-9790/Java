package com.company;
import java.util.Scanner;

class Employee {
    int id,salary;
    String name;
    Scanner cin = new Scanner(System.in);
    public void printdetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my salary is  " + salary);
    }
    public int getSalary(){
        salary = cin.nextInt();
        return salary;
    }
}
public class c38customclass {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("this is your custom class ");
//        employeesss
        Employee john =new Employee();   //3rd employee getting salary thought getSalary...
        Employee harry = new Employee(); // Instantiating a new employee object
        Employee parishkar = new Employee(); // Instantiating a new employee parishkar
//      setting properties of employee 1
        harry.id = 12;
        harry.name = "parishkar";
        System.out.println(harry.id);
        System.out.println(harry.name);
//        taking input of employee two and printing it
        System.out.println("enter the id of the 2nd employee");
        parishkar.id = cin.nextInt();
        System.out.println("enter the name of the 2nd employee");
        parishkar.name = cin.next();
        System.out.println("enter the salary of the 2nd employee");
        parishkar.salary = cin.nextInt();
        parishkar.printdetails();

//      employee 3 details using get salary method
        System.out.println("enter the id of the 2nd employee");
        john.id = cin.nextInt();
        System.out.println("enter the name of the 2nd employee");
        john.name = cin.next();
        System.out.println("enter the salary of the 2nd employee");
        john.getSalary();
        john.printdetails();
    }
}
