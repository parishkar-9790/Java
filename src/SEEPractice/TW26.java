// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;


import java.util.Scanner;

public class TW26 {
    public static boolean isPalindrome(String s, int start, int end) {
        if (s.charAt(start) == s.charAt(end)) {
            if (start < end)
                return isPalindrome(s, start + 1, end - 1);
            if (start == end)
                return true;
        }
        return false;
    }

    public static String reverse(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--)
            n = n + s.charAt(i);
        return n;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s;
        s = read.nextLine();
        if (isPalindrome(s, 0, s.length() - 1))
            System.out.println(s.toUpperCase());
        else
            System.out.println(reverse(s).toLowerCase());
//        for(int i=0;i<)
        String[] str = s.split(" ");

    }
}
