import java.util.Scanner;
import java.lang.Math;

class triangle {
    Scanner read = new Scanner(System.in);
    double side1, side2, side3;

    void getSides() {
        System.out.println("enter the side 1");
        side1=read.nextDouble();
        System.out.println("enter the side 1");
        side2=read.nextDouble();
        System.out.println("enter the side 1");
        side3=read.nextDouble();
    }
     void checktype(){
        if (side1==side2 && side2==side3){
            System.out.println("the triangle is equilateral");
        }
        else if (side1==side2 || side2==side3|| side1==side3){
             System.out.println("the triangle is isosceles");
        }
        else
            System.out.println("triangle is scalene");
    }
    double computeArea(){
        double s,area;
        double result;
        s=(side2+side3+side1)/2;
        area=s*(s-side1)*(s-side2)*(s-side3);
        area=Math.sqrt(area);
        return area;
    }
}
public class tw2triangle {
    public static void main(String[] args) {
        triangle termwork=new triangle();
        termwork.getSides();
        termwork.checktype();
        System.out.println(termwork.computeArea());
    }
}
