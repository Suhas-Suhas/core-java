public class Bike {
    static String name = "R15";
    static float price = 2000000f;
    static String color = "RED";
    static int mileage = 35;

    public static void main(String args[]) {
        String name = "jawa";
        String Name = nameofbike();
        float price = priceofbike();
        String color = colorofbike();
        int milage = mileageofbike();
        System.out.println(Name);
        System.out.println(price);
        System.out.println(color);
        System.out.println(milage);
    }

    public static String nameofbike() {
        return name;
    }

    public static float priceofbike() {
        return price;
    }

    public static String colorofbike() {
        return color;
    }

    public static int mileageofbike() {
        return mileage;
    }

}
