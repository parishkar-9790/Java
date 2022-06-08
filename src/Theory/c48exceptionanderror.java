package Theory;

public class c48exceptionanderror {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{

            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.println("we cannot divide it by zero");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
//        int a = 0;
//        removing the semicolon will cause syntax error
//        b=8;b not declared !
//        write a program to print all prime number between 1 and 10
//        logical error
//        program to print all prime number between all prime number between 1 and 10
//        System.out.println(a);
//        for (int i = 1; i < 10; i++) {
//            System.out.println(2 * i + 1);
//        }
//        runtime error if k==0
//        int k;
//        Scanner sc=new Scanner(System.in);
//        k=sc.nextInt();
//        System.out.println("integer part of 1000 by k is "+1000/k);
