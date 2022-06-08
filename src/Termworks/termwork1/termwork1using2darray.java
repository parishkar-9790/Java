import java.util.Scanner;
public class termwork1using2darray {
    static float bestof(int a, int b, int c) {
        float avg = 0;
        if (a > b && a > c) {
            if (b > c)
                return ((a + b) / 2);
            else
                return ((a + c) / 2);
        } else if (b > a && b > c) {
            if (a > c)
                return ((a + b) / 2);
            else
                return ((b + c) / 2);
        } else {
            if (a > b)
                return ((c + a) / 2);
            else
                return ((c + b) / 2);
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int marks[][] = new int[5][3], total[] = new int[5], i, j, sum = 0;
        float average = 0;
        System.out.println("enter the student data");
        for (i = 0; i < 5; i++) {
            sum = 0;
            System.out.println("\n Enter the marks of the Student:" + (i + 1));
            for (j = 0; j < 3; j++) {
//                System.out.println("subject" + (j + 1) + ":");
                marks[i][j] = read.nextInt();
                sum += marks[i][j];
            }
            total[i] = sum;
        }
        System.out.println("result :-");
        for (i = 0; i < 5; i++) {
            average = bestof(marks[i][0], marks[i][1], marks[i][2]);
            System.out.println(" student " + (i + 1));
            System.out.println(" total/300 " + total[i]);
            System.out.println(" average :" + average);
            System.out.println("");
        }
    }
}