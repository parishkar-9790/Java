package termwork3;

class rectangle {
    int len, br;

    rectangle() {
        len = 0;
        br = 0;
    }

    rectangle(int len, int br) {
        this.len = len;
        this.br = br;
    }

    void area() {
        System.out.println("the area of the rectangle is " + len * br);
    }

}

public class termwork3a {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(5, 5);
        r1.area();
    }
}
