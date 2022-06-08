package com.company;

import java.util.Random;
import java.util.Scanner;

public class c11switchstatements {
    private static String choice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your move 1.rock 2.paper 3.scissors");
        int myMove;
        myMove = sc.nextInt();
        String choice = new String();
        switch (myMove) {
            case 1 -> {
                choice = "rock";
                System.out.println("you have choosen rock");
            }
            case 2 -> {
                choice = "paper";
                System.out.println("you have choosen paper");
            }
            case 3 -> {
                choice = "scissors";
                System.out.println("you have choosen scissors");
            }
            default -> System.out.println("don't fuck with me");
        }
        int aiChoice;
        Random rand = new Random();
        aiChoice = rand.nextInt(3);
        String pcChoice = new String();
        switch (aiChoice) {
            case 0 -> {
                pcChoice = "rock";
                System.out.println("Ai have choosen rock");
            }
            case 1 -> {
                pcChoice = "paper";
                System.out.println("Ai have choosen paper");
            }
            case 2 -> {
                pcChoice = "scissors";
                System.out.println("Ai have choosen scissors");
            }
            default -> System.out.println("don't fuck with me");
        }

//        all the time i will win
        if (choice.equals("rock") && pcChoice.equals("scissors"))
            System.out.println("you win");
        else if (choice.equals("paper") && pcChoice.equals("rock"))
            System.out.println("you win");
        else if (choice.equals("scissors") && pcChoice.equals("paper"))
            System.out.println("you win");
//        all the time i will loose
        else if (choice.equals("paper") && pcChoice.equals("scissors"))
            System.out.println("you lose");
        else if (choice.equals("rock") && pcChoice.equals("paper"))
            System.out.println("you lose");
        else if (choice.equals("scissors") && pcChoice.equals("rock"))
            System.out.println("you lose");
        else
            System.out.println("this match is a tie");

    }
}