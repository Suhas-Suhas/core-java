public class NumberPattern {
    public static void main(String args[]) {
        int rows = 4;
        int columns = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = columns; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
