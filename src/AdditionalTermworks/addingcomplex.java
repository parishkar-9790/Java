package addtionaltermwork.src;

class complex {
    int i;
    int r;

    public complex(int r, int i) {
        this.i = i;
        this.r = r;
    }

    void display() {
        System.out.println("the number is " + r + " + i" + i);
    }

    complex add(complex c1, complex c2) {
        complex temp = new complex(0,0);
        temp.i = c1.i + c2.i;
        temp.r = c1.r + c2.r;
        return temp;
    }
    complex sub(complex c1, complex c2) {
        complex temp = new complex(0,0);
        temp.i = c1.i - c2.i;
        temp.r = c1.r - c2.r;
        return temp;
    }

}

public class addingcomplex {
    public static void main(String[] args) {
        complex c1=new complex(5,6);
        complex c2=new complex(5,6);
        complex res=new complex(0,0);
        res=res.add(c1,c2);
        res.display();

    }
}
