package Theory;

class negativeradiusexception extends Exception {
    @Override
    public String toString() {
        return "radius cannot be negative ";
    }

    public String getMessage() {
        return "radius cannot be negative";
    }
}

public class c52throwandthrows {

    public static float area(int r) throws negativeradiusexception {
        if (r < 0)
            throw new negativeradiusexception();
        float result = (float) (Math.PI * r * r);
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;

    }

    public static void main(String[] args) {
//        try {
//            int c = divide(6, 0);
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
        try {
            float ar = area(-6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
