public class SortArray {
    public static void main(String[] args) {
        int[] array = { 40, 10, 90, 20, 70, 30 };

        // Bubble sort to sort in ascending order
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
