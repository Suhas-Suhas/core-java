public class FindInPrimitiveArrays {
    public static void main(String[] args) {

        // 1. int array
        int[] intArray = new int[] { 10, 20, 30, 50, 20, 90 };
        int intTarget = 50;
        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == intTarget) {
                System.out.println("Integer found: " + intTarget + " at index " + i);
            }
        }

        // 2. char array
        char[] charArray = new char[] { 'a', 'e', 'i', 'o', 'u' };
        char charTarget = 'o';
        System.out.println("\nChar Array:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charTarget) {
                System.out.println("Char found: '" + charTarget + "' at index " + i);
            }
        }

        // 3. float array
        float[] floatArray = new float[] { 10.5f, 20.0f, 30.25f, 40.75f };
        float floatTarget = 30.25f;
        System.out.println("\nFloat Array:");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i]);
        }
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] == floatTarget) {
                System.out.println("Float found: " + floatTarget + " at index " + i);
            }
        }

        // 4. double array
        double[] doubleArray = new double[] { 5.5, 10.0, 15.75, 20.25 };
        double doubleTarget = 15.75;
        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] == doubleTarget) {
                System.out.println("Double found: " + doubleTarget + " at index " + i);
            }
        }
    }
}
