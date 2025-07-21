class Variable {
    public static void main(String args[]) {
        addition();
        addition(200, 450);
        subtraction();
        multiplication();
        additions();

    }

    public static void addition() {
        int a = 120;
        int b = 10;
        int c = a + b;
        System.out.println(c);

    }

    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void subtraction() {
        int a = 110;
        int b = 5;
        int c = a - b;
        System.out.println(c);
    }

    public static void multiplication() {
        int a = 110;
        int b = 5;
        int c = a * b;
        System.out.println(c);
    }

    public static void additions() {
        byte a = 110;
        byte b = 5;
        byte c = (byte) (a + b);
        System.out.print(c);
    }
}