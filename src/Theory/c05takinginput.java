
package Theory;

import java.util.Scanner;

public class c05takinginput {
    public static void main(String[] args) {
        System.out.println("taking input for the user  ");
        Scanner sc = new Scanner(System.in);

        float maths, science, english, hindi, history;
        float percentage, total;

        System.out.println("enter your maths marks");
        maths = sc.nextFloat();
        System.out.println("enter your hindi marks");
        hindi = sc.nextFloat();
        System.out.println("enter your science marks");
        science = sc.nextFloat();
        System.out.println("enter your history marks");
        history = sc.nextFloat();
        System.out.println("enter your english marks");
        english = sc.nextFloat();

        total = (maths + science + english + hindi + history) / 500;
        percentage = total * 100;
        System.out.println("your your total percentage in 10 board is ");
        System.out.println(percentage);

    }
}
