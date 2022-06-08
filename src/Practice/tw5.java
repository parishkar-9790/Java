package Practice;

import java.util.Scanner;

class myCircle{
    double x,y;
    double perimeter,area,diameter,radius;
    myCircle(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter center, x and y coordinates: ");
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        System.out.println("Center: "+"("+x+","+y+")");
        System.out.println("Enter radius: ");
        double radius=scan.nextDouble();
        System.out.println("Radius: "+radius);
        diameter=2*radius;
        System.out.println("Diameter: "+diameter);
    }
    void Sides(){
        System.out.println("Center: "+"("+x+","+y+")");
        System.out.println("Enter radius: ");
//        double radius=scan.nextDouble();
        System.out.println("Radius: "+radius);
        diameter=2*radius;
        System.out.println("Diameter: "+diameter);
    }

    double ComputerPerimeter(){
        perimeter=3.142*2*this.radius;
        return (double)perimeter;
    }

    double ComputeArea(){
        area=(3.142*radius*radius);
        return (double)area;
    }
}
public class tw5 {
    public static void main(String[] args) {
        myCircle c1=new myCircle();
        c1.Sides();
        System.out.println("Area is :"+c1.ComputeArea());
        System.out.println("Perimeter is: "+c1.ComputerPerimeter());

}
}