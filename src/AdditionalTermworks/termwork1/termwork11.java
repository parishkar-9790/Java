package termwork1;

import java.util.*;
import java.lang.*;

public class termwork11 {
    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();

    static void findMax(int[][] a) {
        int[] largest = new int[6];
        int[] n = new int[6];
        for (int i = 0; i < 6; i++) {
            int m = 0;
            for (int j = 0; j < 12; j++) {
                if (m < a[i][j]) {
                    m = a[i][j];
                    n[i] = j;
                }
            }
            largest[i] = m;
        }
        System.out.println("\nthe maximum number of sales made is");
        for (int i = 0; i < 6; i++) {
            System.out.println("The best sale by " + i + " is " + largest[i] + " which was made in the month " + n[i]);
        }
    }

    static void averageSale(int[][] a) {
        int[] average = new int[6];
        int av;
        for (int i = 0; i < 6; i++) {
            av = 0;
            for (int j = 0; j < 12; j++) {
                av = av + a[i][j];
            }
            av = av / 12;
            average[i] = av;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("average sales made by company " + i + " is " + average[i]);
        }
    }

    static void totalSale(int[][] a) {
        int[] average = new int[6];
        int av;
        for (int i = 0; i < 6; i++) {
            av = 0;
            for (int j = 0; j < 12; j++) {
                av = av + a[i][j];
            }
            average[i] = av;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Total sales made by company " + i + " is " + average[i]);
        }
    }

    public static void main(String[] args) {
//        int c = 6, m = 12;
        int[][] data = new int[6][12];
        for (int i = 0; i < 6; i++) {
            System.out.println("\n enter the data for the " + i + " manufracturer ");
            for (int j = 0; j < 12; j++) {
                data[i][j] = rand.nextInt(1, 99);
                System.out.print(data[i][j] + " ");
            }
        }
        findMax(data);
        averageSale(data);
        totalSale(data);
    }
}
