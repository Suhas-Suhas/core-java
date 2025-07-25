
public class UserDefinedArray {
    public static void main(String args[]) {
        String[] traineeNames = { "MANU", "MADHU" };
        System.out.println(traineeNames.length);
        System.out.println(traineeNames[0]);
        System.out.println(traineeNames[1]);
        for (int i = 0; i < traineeNames.length; i++) {
            System.out.println(traineeNames[i]);

        }
        int[] numberOfStudentsInBatch = { 10, 5, 30, 40, 50 };
        System.out.println(numberOfStudentsInBatch);
        for (int i = 0; i < numberOfStudentsInBatch.length; i++) {
            System.out.println(numberOfStudentsInBatch[i]);
            System.out.println(numberOfStudentsInBatch[3]);
            System.out.println(numberOfStudentsInBatch[4]);
        }

    }
}
