package termwork4;

class circle {
    double radius;
    String color = "red";

    circle() {
        radius = 1;
    }

    circle(int radius) {
        this.radius = radius;
    }

    circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getarea() {
        return 3.14 * radius * radius;
    }

}

class cylinder extends circle {
    double height;

    cylinder() {
        height = 1;
    }

    cylinder(double height) {
        this.height = height;
    }

    cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    cylinder(double height, double radius, String color) {
        this.height = height;
        this.radius = radius;
        this.color = color;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return height * radius;
    }
}

public class cylinderclass {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(5, 5);
        System.out.println(c1.volume());
    }
}
