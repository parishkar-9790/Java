package termwork1;

class Stack {
    int elem[];
    int top;

    void initStack(int size) {
        elem = new int[size];
        top = -1;
    }

    void initStack(int []a) {
        elem = new int[a.length];
        top = -1;
        for (int s :a) {
            push(s);
        }
    }

    void initStack(Stack stack2) {
        elem = new int[stack2.elem.length];
        top = -1;
        for (int s : stack2.elem) {
            push(s);
        }
    }
    void push(int s) {
        if (isfull()) {
            System.out.println("stack overflow");
        } else {
            elem[++top] = s;
            System.out.println("pushed into the stack" + s);
        }
    }

    void pop() {
        if (isEmpty())
            System.out.println("stack underflow");
        else
            System.out.println("element is poped" + elem[top--]);
    }

    boolean isfull() {
        return top == elem.length - 1;
    }

    boolean isEmpty() {
        return top == -1;

    }
}
public class tw1 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.initStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        Stack s2=new Stack();
        s2.initStack(s1);
        s2.pop();
        s2.pop();
        s2.pop();
        s2.pop();
        s2.pop();
        s2.pop();
//        s2.peek();
        int[]a = {1,2,3,4,5,6};
        Stack s3=new Stack();
        s3.initStack(a);
//        s3.peek();
        s3.pop();
        s3.pop();
        s3.pop();
    }
}
