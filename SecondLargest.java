public class SecondLargest {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 50, 60 };
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

        }
        System.out.println("Second Largest : " + secondLargest);
    }
}
