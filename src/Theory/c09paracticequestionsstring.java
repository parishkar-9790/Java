package com.company;

import java.util.Scanner;

public class c09paracticequestionsstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//      Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//      problem 2
        String text="To My Friend";
        text=text.replace(" ","_");
        System.out.println(text);

//      Problem 3  write letter template
        String letter="Dear <|name|>, thanks a lot!";
        System.out.println("enter your name");
        String newName=sc.nextLine();
        letter= letter.replace("<|name|>",newName);
        System.out.println(letter);

//      Problem 4 to find double and triple spaces in string
        String myString= "this string contain  double and   triple space";
        System.out.println("this -1 shows that you have no spaces");
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("    "));

//        program 5 to find the format of the following letter using escape sequence character
          String myLetter ="Dear harry \n\t thanks this java course is very nicee \n\t thanks";
          System.out.println(myLetter);

    }
}
