// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Scanner;

interface stackOP {
    Scanner read = new Scanner(System.in);

    void push();

    void pop();

    void peek();

    void display();
}

class fixedStack implements stackOP {
    int top;
    int[] stack;

    fixedStack(int n) {
        stack = new int[n];
        top = -1;
    }

    @Override
    public void push() {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter Number to Push: ");
            stack[++top] = read.nextInt();
            System.out.println("Pushed ! " + stack[top]);
        }
    }


    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    @Override
    public void peek() {
        System.out.println("The stack top element is " + stack[top]);
    }

    @Override
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(" " + stack[i] + " ");
        }
        System.out.println();
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

class dynamicStack implements stackOP {
    int top;
    int size;
    int[] stack;

    void increasecap() {
        int[] newStack = new int[size + 1];
        if (size >= 0) System.arraycopy(this.stack, 0, newStack, 0, size);
        stack = newStack;
        size++;
    }

    @Override
    public void push() {
        increasecap();
        System.out.print("Enter Number to Push: ");
        stack[++top] = read.nextInt();
        System.out.println("Pushed ! " + stack[top]);
    }

    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    @Override
    public void peek() {
        System.out.println("The stack top element is " + stack[top]);
    }

    @Override
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(" " + stack[i] + " ");
        }
        System.out.println();
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

public class TW22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int s;
        System.out.println("enter the size of static size");
        s = read.nextInt();
        fixedStack staticstack = new fixedStack(s);
        staticstack.operate();
        System.out.println("Dynamic Stack");
        dynamicStack dynastack = new dynamicStack();
        dynastack.operate();

    }
}