// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

class arrayStack {
    int top;
    int size;
    int[] array;

    void initstack(int size) {
        array = new int[size];
        top = -1;
    }

    void push(int item) {
        if (top < array.length) {
            array[++top] = item;
        } else
            System.out.println("the stack is full ");
    }

    void pop() {
        if (top == -1) {
            System.out.println("the stack is underflow");
        } else {
            top--;
        }
    }

    void print() {
        System.out.println();
        for (int i = top; i >= 0; i--) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
    }
}

class linkedstack extends arrayStack {
    node top;

    public class node {
        int data;
        node link;
    }

    linkedstack() {
        this.top = null;
    }

    @Override
    void pop() {
        if (top == null)
            System.out.println("Stack underflow");
        else
            top = top.link;
    }

    @Override
    void push(int item) {
        node temp = new node();
        if (temp == null) {
            System.out.println("overflow no space");
            return;
        }
        temp.data = item;
        temp.link = top;
        top = temp;
    }

    @Override
    void print() {
        node temp = top;
        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.link;
        }
    }

}

public class TW17 {
    public static void main(String[] args) {
        arrayStack s1 = new arrayStack();
        s1.initstack(4);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.print();
        linkedstack s2 = new linkedstack();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        s2.push(50);
        s2.print();
    }
}
