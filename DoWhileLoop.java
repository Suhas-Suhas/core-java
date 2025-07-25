public class DoWhileLoop {
    public static void main(String args[]) {
        int i = 0;
        System.out.println("for loop");
        do {

            if (i % 2 == 0) {
                System.out.println("Even numbers:" + i);
            } else if (i % 2 == 1) {
                System.out.println(" odd numbers:" + i);
            } else if (i % 3 == 0) {
                System.out.println("Divisible by 3:" + i);
            } else if (i % 4 == 0) {
                System.out.println("diisible  by 4:" + i);
            } else {
                System.out.println("natural Numbers");
            }
            i++;

        } while (i < 10);
    }
}
