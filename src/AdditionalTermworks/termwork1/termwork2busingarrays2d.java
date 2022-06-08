import java.util.Scanner;
import java.util.Random;

public class termwork2busingarrays2d {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        int data[][] = new int[4][10];
        int p, i, j;
        int bestOffice[] = new int[4];
        int worstOffice[] = new int[4];
        int maxs = 0, mins = 9999;
        int max[] = new int[4];
        int min[] = new int[4];
        String zone[] = {"North", "South", "East", "West"};
        float average[] = new float[4];
        for (i = 0; i < 4; i++) {
            System.out.println("\nThe zone is: " + zone[i]);
            float sum = 0;
            maxs = 0;
            mins = 9999;
            System.out.println("enter the sales made by offices :");
            for (j = 0; j < 10; j++) {
//                data[i][j] = read.nextInt();
                data[i][j] = rand.nextInt(20, 80);
                System.out.print(data[i][j] + " ");
                sum = sum + data[i][j];

                if (data[i][j] > maxs) {
                    maxs = data[i][j];
                    bestOffice[i] = j;
                }
                if (mins > data[i][j]) {
                    mins = data[i][j];
                    worstOffice[i] = j;
                }

            }
            average[i] = sum / 10;
            max[i] = maxs;
            min[i] = mins;
        }
        for (i = 0; i < 4; i++) {
            System.out.println("\nThe best office in the " + zone[i] + " zone is:");
            System.out.print(bestOffice[i]);
            System.out.println("\n this office made " + max[i] + " sales");
        }
        System.out.println("\n");
        for (i = 0; i < 4; i++) {
            System.out.println("\nThe worst office in the " + zone[i] + " zone is:");
            System.out.print(worstOffice[i]);
            System.out.println("\nthis office made " + min[i] + " sales");
        }
        System.out.println("\n");
        for (i = 0; i < 4; i++) {
            System.out.println("\nThe average sales in the " + zone[i] + " zone is :");
            System.out.print(average[i]);
        }
        System.out.println("\n");
    }
}
