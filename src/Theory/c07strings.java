package Theory;// package com.company;
import java.util.Scanner;

public class c07strings {
    public static void main(String[] args){
        String name= new String("parishkar");
        System.out.print("your new string is ");
        System.out.println(name);
        int a =6;
        float b=5.6544f;
        System.out.printf("the value of a is %d nad the value of b is %f",a,b);
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);
    }
}
