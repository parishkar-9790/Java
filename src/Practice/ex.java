package Practice;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        int count=0;
        int i;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1;
        str1=s.nextLine();

        System.out.println("Enter index: ");
//        int index=s.nextInt();
//        char c = str1.charAt(index);
        String c=s.next();
        for( i=0;i<(str1.length())-1;i++)
            if(c.equals(String.valueOf(str1.charAt(i)))){
                count++;}

        System.out.println("Frequency of " + c + " is" + count + "");
    }
}

