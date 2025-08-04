public class TableFour {
    public static void main(String args[]) {
        int[] TableFour = new int[10];
        for (int i = 0; i < TableFour.length; i++) {
            TableFour[i] = 4 * (i + 1);
        }
        for (int i = 1; i <= TableFour.length; i++) {
            TableFour[i - 1] = 4 * i;
        }
        System.out.println("4s multiplication table");
        for (int i = 0; i < TableFour.length; i++) {
            System.out.println(TableFour[i]);
        }
    }

}
