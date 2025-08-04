public class NumberPattern1 {
    public static void main(String args[]) {
        int rows = 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 2; j <= 8; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
