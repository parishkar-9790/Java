package com.company;
import java.util.Scanner;

public class c10conditonals {
    public static void main(String[] args){
        Scanner par=new Scanner(System.in);

//        System.out.println("enter your age sir and mam");
//        a=par.nextInt();
//        if (a>18)
//            System.out.println("you are eligible to drink");
//        else
//            System.out.println("get the fuck out of here");
        System.out.print("for logical and ");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if(a && b && c){
            System.out.print("yes");
        }
        else
            System.out.print("No");
    }
}
