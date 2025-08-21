public class DigitCount {
    public static void main(String[] args) {
        int number = 5678;
        int count = 0;
        int temp = number;

        if (temp == 0) {
            count = 1;
        } else {
            if (temp < 0) {
                temp = -temp;
            }
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
