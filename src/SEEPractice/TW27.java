// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TW27 {
    public static boolean checkA(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        if (ch1.length != ch2.length)
            return false;
        for (int i = 0; i < ch1.length - 1; i++) {
            for (int j = 0; j < ch1.length - i - 1; j++) {
                if (ch1[j] > ch1[j + 1]) {
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ch2.length - 1; i++) {
            for (int j = 0; j < ch2.length - i - 1; j++) {
                if (ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
                }
            }
        }
        if (Arrays.equals(ch1, ch2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String one, two;
        one = read.next();
        two = read.next();
        if (checkA(one, two))
            System.out.println("The string are anagrams");
        else System.out.println("The string are not anagrams");

    }
}
