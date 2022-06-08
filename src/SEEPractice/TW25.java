package SEEPractice;

class Stackg {
    int top;
    int[] array;
    int size;

    Stackg(int x) {
        array = new int[x];
        top = -1;
        size = x;
    }

    void push(int x) {
        try {
            if (top == size - 1) {
                throw new overflow("Stack overflow");
            } else array[++top] = x;
        } catch (overflow e) {
            System.out.println(e.getMessage() + e);

        }
    }

    void pop() {
        try {
            if (top == -1) {
                throw new underflow("Stack underflow-");
            } else System.out.println("popped" + array[top--]);

        } catch (underflow e) {
            System.out.println(e.getMessage() + e);

        }
    }
}

class underflow extends Exception {
    public underflow(String msg) {
        super(msg);
    }

    public String toString() {
        return "The Stack is underflown";
    }
}

class overflow extends Exception {
    public overflow(String msg) {
        super(msg);
    }

    public String toString() {
        return "The Stack overflown";
    }
}

public class TW25 {
    public static void main(String[] args) {
        Stackg s = new Stackg(10);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
//        s.pop();
    }
}
