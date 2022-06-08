package Theory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class c49specificexceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner read = new Scanner(System.in);
        System.out.println("enter the array index");

        try {
            int ind = read.nextInt();
            System.out.println("enter the number you want to divide");
            int number = read.nextInt();
            System.out.println("the value of array index is " + marks[ind]);
            System.out.println("the value of array index is " + marks[ind] / number);
        }
//        catch(Exception e) {
//            System.out.println("some excetion occured");
//            System.out.println(e);
//        }
        catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some excetion occured");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
