public class LargestNumber {
    public static void main(String args[]) {
        int a = 80;
        int b = 40;
        int c = 120;
        if (a > b && a > c) {
            System.out.println("A is greater than" + a);
        } else if (b > a && b > c) {
            System.out.println("B is greater than" + b);
        } else {
            System.out.println("greatest of 3 numbers is " + c);
        }

    }
}
