import java.util.Scanner;
public class tw2rectangle {
    static class rectangle1 {
        Scanner read = new Scanner(System.in);
        int length, breath;

        public void getdim() {
            System.out.println("enter the length :");
            length = read.nextInt();
            System.out.println("enter the breath :");
            breath = read.nextInt();
        }

        public int getArea() {
            int area = length * breath;
            return area;

        }
    }


    public static void main(String[] args) {
        rectangle1 r1 = new rectangle1();
        r1.getdim();
        System.out.println("the area of the triangle is");
        System.out.println(r1.getArea());
    }
}
