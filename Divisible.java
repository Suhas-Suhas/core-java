public class Divisible {
    public static void main(String args[]) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers" + i);

            }
        }
        System.out.println("\n");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 1) {
                System.out.println("odd numbers" + k);

            }
        }
        System.out.println("\n");
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.println("divisible by 3:" + j);

            }
        }
        System.out.println("\n");
        for (int m = 1; m <= 100; m++) {
            if (m % 5 == 0) {
                System.out.println("divisible by 5:" + m);

            }
        }
    }
}
