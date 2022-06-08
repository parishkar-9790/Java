package addtionaltermwork.src;
import java.util.Scanner;

class linearsearch {
    boolean t;
    linearsearch(int[] a, int key) {
        for (int i =0;i<a.length;i++) {
            if (a[i] == key) {
                System.out.println("key is found");
                t=true;
                break;
            }
        }
    }

    linearsearch(double[] a, double key) {
        for (int i =0;i<a.length;i++) {
            if (a[i] == key) {
                System.out.println("key is found");
                break;
            }
        }
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        int key = read.nextInt();
        int[] a = {1, 2, 3, 4, 5,4};
        linearsearch c1 = new linearsearch(a, 4);
        double[] b = {1.1, 2.2, 3.3, 4.4, 5.5};
        linearsearch c2 = new linearsearch(b, 4.4);
//        System.out.println("the key is here");
    }
}

