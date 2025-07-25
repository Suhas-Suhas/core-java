public class SmallestNumber {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 20;
        int smallest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < c && b < a) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
