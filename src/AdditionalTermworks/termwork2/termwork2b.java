package termwork2;

import java.util.Scanner;

class Lamp {
    boolean status;

    void turnOn() {
        System.out.println("⚫");
        status = true;

    }

    void turnoff() {
        System.out.println("◯");
        status = false;
    }

    void state() {
        if (status)
            System.out.println("light is on ⚫ ");
        else
            System.out.println("Light is off ◯");
    }
}

public class termwork2b {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        while (true) {
            System.out.println("1.lightON  2.lightOFF 3.Check  4.close");
            int choice = read.nextInt();
            int br = 0;
            switch (choice) {
                case 1 -> l1.turnOn();
                case 2 -> l1.turnoff();
                case 3 -> l1.state();
                case 4 -> br = 1;
            }
            if (br == 1) {
                break;
            }
        }
    }
}
