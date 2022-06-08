package termworks.termwork7;

import java.util.*;
import java.lang.Math;

interface IPrime {

    boolean isPrime(int num);
}

class PrimeTester implements IPrime {

    @Override
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class ImprPrimeTester implements IPrime {

    @Override
    public boolean isPrime(int num) {
        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class FasterPrimeTester implements IPrime {

    @Override
    public boolean isPrime(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class FastestPrimeTester implements IPrime {
    @Override
    public boolean isPrime(int num) {
        int a = 2;
        if(num==2)
            return true;
        return Math.pow(a, num - 1) % num == 1;
    }
}

public class Parishkartw7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean answer = true;
        int n;
        System.out.println("enter your number to check");
        n = read.nextInt();
        if (n == 1) {
            System.out.println("you number is neither composite nor prime ");
        } else {

//            System.out.println("Your number is ");
            PrimeTester n1 = new PrimeTester();
            System.out.println("using Prime Tester");
            answer = n1.isPrime(n);
            System.out.println("your answer prime number :" + answer);
            System.out.println("");

            ImprPrimeTester n2 = new ImprPrimeTester();
            System.out.println("using Impr Prime Tester");
            answer = n2.isPrime(n);
            System.out.println("your answer prime number :" + answer);
            System.out.println("");

            FasterPrimeTester n3 = new FasterPrimeTester();
            System.out.println("using Faster Prime Tester");
            answer = n3.isPrime(n);
            System.out.println("your answer prime number :" + answer);
            System.out.println("");

            FastestPrimeTester n4 = new FastestPrimeTester();
            System.out.println("using Faster Prime Tester");
            answer = n4.isPrime(n);
            System.out.println("your answer prime number :" + answer);
            System.out.println("");
        }
    }
}
