package AdditionalTermworks.termwork7;

import java.util.Scanner;

interface stackinterface {
    Scanner read = new Scanner(System.in);

    void pop();

    void peek();

    void push();

    void display();
}

class fixedstack implements stackinterface {
    int top;
    int[] stack;

    fixedstack(int n) {
        top = -1;
        stack = new int[n];
    }

    public void push() {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter Number to Push: ");
            stack[++top] = read.nextInt();
            System.out.println("Pushed ! " + stack[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {

            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    public void peek() {
        System.out.println("Element at the top : " + stack[top]);
    }

    public void display() {
        for (int i = top; i >= 0; i--)
            System.out.println("| " + stack[i] + " |");
    }

    void operate() {
        int choice;
        do {
            System.out.println("1.push 2.pop 3.peek 4.display ");
            choice = read.nextInt();
            switch (choice) {
                case 1 -> push();
                case 2 -> pop();
                case 3 -> peek();
                case 4 -> display();
            }
        } while (choice != 5);
    }
}

class dynamicStack implements stackinterface {
    int top = -1;
    int size = 1;
    int[] stack = new int[1];

    public void increasecapacity() {
        int[] newStack = new int[size + 1];
        if (size >= 0) System.arraycopy(this.stack, 0, newStack, 0, size);
        stack = newStack;
        size++;
    }

    public void push() {
            increasecapacity();
            System.out.print("Enter Number to Push: ");
            stack[++top] = read.nextInt();
            System.out.println("Pushed ! " + stack[top]);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    public void peek() {
        System.out.println("Element at the top : " + stack[top]);
    }

    public void display() {
        for (int i = top; i >= 0; i--)
            System.out.println("| " + stack[i] + " |");
    }

    void operate() {
        int choice;
        do {
            System.out.println("1.push 2.pop 3.peek 4.display ");
            choice = read.nextInt();
            switch (choice) {
                case 1 -> push();
                case 2 -> pop();
                case 3 -> peek();
                case 4 -> display();
            }
        } while (choice != 5);
    }
}

public class stackcalss {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int s;
        System.out.println("enter the size of static size");
        s = read.nextInt();
        fixedstack staticstack = new fixedstack(s);
        staticstack.operate();
        System.out.println("Dynamic Stack");
        dynamicStack dynastack=new dynamicStack();
        dynastack.operate();

    }
}
