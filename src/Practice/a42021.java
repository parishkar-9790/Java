package Practice;

import java.util.Scanner;

public class a42021 {
    public static void sub(int a, int b) {
        System.out.println("the sub of two integer is " + (a - b));
    }

    public static void sub(double a, double b) {
        double value=a-b;
//        value.setPrecision(3);
        System.out.printf("the sub of two double is %.2f" , value);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        sub(1, 2);
        sub(1.90, 2.10);
    }
}
