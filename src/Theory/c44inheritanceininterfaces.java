interface sampleinterface {
    void meth1();
    void meth2();
}
interface childsample extends sampleinterface {
    void meth1();
    void meth2();
    void meth3();
    void meth4();
}
class mysampleclass implements childsample {
    public void meth3() {
        System.out.println("meth 3");
    }
    public void meth4() {
        System.out.println("meth 3");
    }
    public void meth1() {
        System.out.println("math 1");
    }
    public void meth2() {
        System.out.println("math 2");
    }
}
public class c44inheritanceininterfaces {
    public static void main(String[] args) {
    mysampleclass obj=new mysampleclass();
    obj.meth1();
    obj.meth2();
    obj.meth3();
    }
}
