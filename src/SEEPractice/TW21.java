// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

interface IPrime {
    boolean isPrime(int num);
}

class PrimeTester implements IPrime {
    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

class ImprTester implements IPrime {
    public boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

class fasterPrimeTester implements IPrime {
    public boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

class fastestPrimeTester implements IPrime {
    public boolean isPrime(int num) {
        int a = 2;
        if (num == 2)
            return true;
        return Math.pow(a, num - 1) % num == 1;
    }

}

public class TW21 {
    public static void main(String[] args) {
        fastestPrimeTester n1 = new fastestPrimeTester();
        System.out.println(n1.isPrime(7));
        System.out.println(n1.isPrime(10));
        System.out.println(n1.isPrime(11));
        System.out.println(n1.isPrime(19));
    }
}
