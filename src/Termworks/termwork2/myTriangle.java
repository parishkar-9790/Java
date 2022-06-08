package termwork2;
import java.io.*;
import java.lang.*;
import java.lang.Math;
class Triangle {
    double s1, s2, s3;
    double area;
    void assign(double side1, double side2, double side3) {
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
    }
    void checkttype() {
        if (s1 + s2 > s3) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("the triangle is equilatoral");
            } else if (s1 == s2 || s1 == s3 ) {
                System.out.println("the triangle is isoceles");
            } else
                System.out.println("the triangle is Scalene");
        } else
            System.out.println("this is not a triangle");
    }
    void area() {
        double s = (s1 + s2 + s3)/2;
        area = s * (s - s1) * (s - s2) * (s - s3);
        area = Math.sqrt(area);
        System.out.println("the area is ");
        System.out.println(String.format("%.4f",area));
    }
}
public class myTriangle {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.assign(6,6,9);
        t1.checkttype();
        t1.area();
        Triangle t2=new Triangle();
        t2.assign(3,4,5);
        t2.checkttype();
        t2.area();
        Triangle t3=new Triangle();
        t3.assign(2,2,2);
        t3.checkttype();
        t3.area();
    }
}
