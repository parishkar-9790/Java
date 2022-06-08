package AdditionalTermworks.termwork9;

import java.util.Scanner;

class books {
    Scanner read = new Scanner(System.in);
    int id;
    String title;
    String author, genre;

    void readdata() {
        System.out.println("");
        System.out.println("Enter the Id of the book: ");
        id = read.nextInt();
        System.out.println("Enter the title of the book: ");
        title = read.nextLine();
        System.out.println("Enter the name of the Author: ");
        author = read.nextLine();
        System.out.println("Enter the genre of Book: ");
        genre = read.next();
        System.out.println("");
    }

    void display() {
        System.out.println("");
        System.out.println("Id :" + id);
        System.out.println("title :" + title);
        System.out.println("author :" + author);
        System.out.println("genre :" + genre);
        System.out.println("");
    }
}

public class tw9add {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number of the books");
        int n = read.nextInt();
        int choice;
        books[] database = new books[n];
        for (int i = 0; i < n; i++) {
            database[i].readdata();
        }
    }

    public static void search(int n, books[] b) {
        Scanner read = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the name to check");
        String t = read.nextLine();

        for (int i = 0; i < n; i++) {
            if (t.equalsIgnoreCase(b[i].title)) {
                System.out.println("Book Exist!");
                return;
            }
        }
    }

    public static void str(int n, books[] b) {
        for (int i = 0; i < n; i++) {
            if (b[i].title.contains("str")) {
                b[i].display();
            }
        }
    }

    public static void genrecheck(String t, int n, books[] b) {
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (t.equalsIgnoreCase(b[i].author)) {
                System.out.println(b[i].author);
            }
        }
    }

    public static void authorwithac(int n, books[] b) {
        System.out.println("");
        String c = "c";
        for (int i = 0; i < n; i++) {
            if (c.equalsIgnoreCase(String.valueOf(b[i].author.charAt(0)))) {
                System.out.println(b[i].author);
            }
        }
    }
}
