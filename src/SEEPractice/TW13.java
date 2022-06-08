// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

class stack {
    int top;
    int size;
    int[] array;

    void initStack(int size) {
        this.top = -1;
        array = new int[size];
    }

    void initStack(stack another) {
        array = new int[another.array.length];
        top = -1;
        for (int s : another.array)
            push(s);

    }

    void initStack(int[] a) {
        array = new int[a.length];
        top = -1;
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push(int a) {
        if (top < array.length) {
            array[++top] = a;
//            System.out.println("pushed element : " + a);
        } else
            System.out.println("stack overflow");
    }

    int pop() {
        if (top != -1) {
            int a = array[top--];
            System.out.println("poped element");
            return a;
        } else {
            System.out.println("cant pop that out !!!");
            return -1;
        }
    }

    void printstack() {
        System.out.println();
        for (int i = 0; i < array.length; i++)
        System.out.print(" " + array[i] + " ");
        System.out.println();
    }
}

public class TW13 {
    public static void main(String[] args) {
        stack s1 = new stack();
        stack s2 = new stack();
        stack s3 = new stack();
        int arr[] = {1, 2, 34, 6, 8, 4, 9};
        s1.initStack(10);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s2.initStack(s1);
        s3.initStack(arr);
        s1.printstack();
        s2.printstack();
        s3.printstack();

    }
}
