package Theory;

public class c53finally {
    public static void greet() {
        try {
            int a = 5;
            int b = 2;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//            System.out.println();
            System.out.println("cleaning up resources");
        }
    }

    public static void main(String[] args) {
        greet();
    }
}
