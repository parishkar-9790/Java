package termwork3;

class complex {
    int r, i;

    complex() {
        this.i = 0;
        this.r = 0;
    }

    complex(int r, int i) {
        this.i = i;
        this.r = r;
    }

    complex add(complex c1, complex c2) {
        complex temp = new complex();
        temp.r = c1.r + c2.r;
        temp.i = c1.i + c2.i;
        return temp;
    }

    complex sub(complex c1, complex c2) {
        complex temp = new complex();
        temp.r = c1.r - c2.r;
        temp.i = c1.i - c2.i;
        return temp;
    }

    void display() {
        System.out.println(r + " + " + i + "i");
//        System.out.println("the imaginary part is"+i);

    }
}

public class termwork3b {
    public static void main(String[] args) {
        complex c1 = new complex(4, 5);
        complex c2 = new complex(4, 5);
        complex result = new complex(0, 0);
        result = result.add(c1, c2);
        result.display();
    }
}
