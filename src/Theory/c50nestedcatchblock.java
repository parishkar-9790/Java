package Theory;

import java.util.Scanner;

public class c50nestedcatchblock {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 0;
        marks[1] = 1;
        marks[2] = 2;
        Scanner read = new Scanner(System.in);
        System.out.println("the value of index ");
        int ind = read.nextInt();
        try {
            System.out.println("welcome ");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("the exception is level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level  1");
        }
    }
}
