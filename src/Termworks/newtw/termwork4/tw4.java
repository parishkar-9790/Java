package termwork4;
import java.util.*;

//super class
class rectangle {

    public
    double length, width;

    rectangle() {
        length = 1.0;
        width = 1.0;
    }

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double computeArea() {
        return length * width;
    }

    double computePerimeter() {
        return 2 * (length + width);
    }
}

//sub class
class cuboid extends rectangle {
    double height;

    cuboid() {
        super();
        height = 1.0;
    }

    cuboid(double length, double width, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double computeArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }

    double computePerimeter() {
        return 4 * (length + width + height);
    }

    double computeVolume() {
        return length * width * height;
    }

}

public class tw4 {
    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        System.out.println("default constructor of rectangle");
        System.out.println("the area of the rectangle is " + r1.computeArea());
        System.out.println("the Perimeter of the rectangle is " + r1.computePerimeter());
        System.out.println();
        rectangle r2 = new rectangle(2.7, 3.9);
        System.out.println("parameterised constructor of rectangle");
        System.out.println("the area of the rectangle is " + r2.computeArea());
        System.out.println("the Perimeter of the rectangle is " + r2.computePerimeter());
        System.out.println();
        System.out.println("default contructor of cuboid ");
        cuboid c1 = new cuboid();
        System.out.println();
        System.out.println("the area of the cuboid is " + c1.computeArea());
        System.out.println("the Perimeter of the cuboid is " + c1.computePerimeter());
        System.out.println("the Volume of the cuboid is " + c1.computeVolume());
        cuboid c2 = new cuboid(2.7, 3.9, 5.0);
        System.out.println();
        System.out.println("parameterised constructor of cuboid ");
        System.out.println("the area of the cuboid is " + c2.computeArea());
        System.out.println("the Perimeter of the cuboid is " + c2.computePerimeter());
        System.out.println("the Volume of the cuboid is " + c2.computeVolume());
    }
}
