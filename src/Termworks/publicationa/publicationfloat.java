import java.util.Scanner;

class publication {
    Scanner read = new Scanner(System.in);
    public float price;
    public String title;

    public void getdata() {
        System.out.println("enter the title of the publication");
        title = read.next();
        System.out.println("enter the price of the publication");
        price = read.nextFloat();
    }

    public void putdata() {
        System.out.println("Publication Title:- " + title);
        System.out.println("Publication Price:- " + price);
    }
}

class sales extends publication {
    public float[] sale = new float[3];
//    Scanner read2 = new Scanner(System.in);

    public void getdata() {
        super.getdata();
        System.out.println("enter the sales of 1 month");
        sale[0] = read.nextFloat();
        System.out.println("enter the sales of 2 month");
        sale[1] = read.nextFloat();
        System.out.println("enter the sales of 3 month");
        sale[2] = read.nextFloat();
    }

    public void putdata() {
        super.putdata();
        for (int i = 0; i < 3; i++) {
            System.out.println("the sale of month" + (i + 1) + "is " + sale[i]);
        }
    }
}

class book extends sales {
    public int pagecount;

    public void getdata() {
        super.getdata();
        System.out.println("enter the page count");
//        Scanner read = new Scanner(System.in);
        pagecount = read.nextInt();
    }

    public void putdata() {
        super.putdata();
        System.out.println("the number of the pages is " + pagecount);
    }
}
class tape extends sales{
    float playtime;
    public void getdata(){
        super.getdata();
        System.out.println("enter the playing time :");
        playtime=read.nextFloat();
    }
    public void putdata(){
        super.putdata();
        System.out.println("tape playing time is "+playtime);
        System.out.println("\n");
    }
}


public class publicationfloat {
    public static void main(String[] args) {
        book book1=new book();
        tape tape1=new tape();
        book1.getdata();
        book1.putdata();
        tape1.getdata();
        tape1.putdata();
    }
}
