// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Scanner;

public class TW15 {
    static Scanner read = new Scanner(System.in);

    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void sort(int[] a, int order) {
//        System.out.println("Enter the choice you want the array to be sorted in 1. Increasing 2.decreasing");
//        order = read.nextInt();

        if (order == 1) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        } else if (order == 2) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - i - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
    }

    static void sort(int a[], int start, int end, int order) {
//        System.out.println("enter the order 1.increasing 2.decresing");
//        int order = read.nextInt();
        if (order == 1) {
            for (int i = start; i < end; i++) {
                for (int j = start; j < end - i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        } else if (order == 2) {
            for (int i = start; i < end; i++) {
                for (int j = start; j < end - i; j++) {
                    if (a[j] < a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
    }

    static void print(int a[]) {
        System.out.println();
        for (int s : a) {
            System.out.print(" " + s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 24, 67, 88, 69, 40, 2};
        print(arr);
        int arr1[] = {10, 1, 4, 24, 67, 88, 69, 40, 2};
        sort(arr1);
        print(arr1);
        int arr2[] = {10, 1, 4, 24, 67, 88, 69, 40, 2};
        sort(arr2, 2);
        print(arr2);
        int arr3[] = {10, 1, 4, 24, 67, 88, 69, 40, 2};
        sort(arr3, 0, 5, 2);
        print(arr3);
    }
}

