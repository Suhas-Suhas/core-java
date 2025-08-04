public class CopyArray {
    public static void main(String args[]) {
        int[] ages = new int[4];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i + (20 * i);
        }
        System.out.println("Before Copying to another array=====");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        int copyArray[] = new int[ages.length];
        for (int i = 0; i < ages.length; i++) {
            copyArray[i] = ages[i];
        }
        System.out.println("After copying to another array");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(copyArray[i]);
        }
    }
}
