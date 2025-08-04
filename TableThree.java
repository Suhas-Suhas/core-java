public class TableThree {
    public static void main(String args[]) {
        int[] TableThree = new int[10];
        for (int i = 0; i < TableThree.length; i++) {
            TableThree[i] = 3 * (i + 1);
        }
        for (int i = 1; i <= TableThree.length; i++) {
            TableThree[i - 1] = 3 * i;
        }
        System.out.println("3s multiplication table");
        for (int i = 0; i < TableThree.length; i++) {
            System.out.println(TableThree[i]);
        }
    }

}
