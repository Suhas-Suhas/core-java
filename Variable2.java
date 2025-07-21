public class Variable2 {
    public static void main(String args[]) {
        addition();
        subtraction();
        multiplication();

    }

    public static void addition() {

        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);

    }

    public static void subtraction() {
        byte a = 100;
        byte b = 50;
        byte c = (byte) (a - b);
        System.out.println(c);
    }

    public static void multiplication() {
        byte a = 110;
        byte b = 35;
        byte c = (byte) (a * b);
        System.out.println(c);

    }
}
