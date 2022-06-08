package termwork2;

import java.util.*;

class myCircle {
    int r;
    int x = 0, y = 0;

    myCircle(int r) {
        this.r = r;
    }

    void area() {
        double area;
        area = (3.14 * r * r);
        System.out.println("the area is " + area);
    }

    void diameter() {
        System.out.println("the diameter is " + (r * 2));
    }

    void perimeter() {
        System.out.println("the perimeter of the circle is " + 2 * 3.14 * r);
    }
}

public class termwork2a {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        myCircle c1 = new myCircle(3);
        c1.area();
        c1.diameter();
        c1.perimeter();
    }
}
