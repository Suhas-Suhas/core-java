public class Pgm3 {
    public static void main(String args[]) {
        addition(4000, 400);
        subtraction(45000, (short) 2550);

    }

    public static void addition(long a, int b) {
        long c = a + b;
        System.out.println(c);
    }

    public static void subtraction(double a, short b) {
        double c = a + b;
        System.out.println(c);
    }
}
