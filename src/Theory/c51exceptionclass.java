package Theory;

import java.util.Scanner;

class myexception extends Exception {
    @Override
    public String toString() {
        return super.toString() + " I am getString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am a getMessage ";
    }
}

public class c51exceptionclass {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        if (a < 9 && a != 0) {
            try {
                throw new myexception();
//                throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        } else if (a == 0) {
            try{
                throw new ArithmeticException("div by zero");

            }
            catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
        }
        System.out.println("program executed!");
    }
}
