public class Car {
    static String name = "BMW";
    static String color = "RED";
    static int speed = 200;
    static int mileagekm = 10;
    static boolean auto;

    public static void main(String args[]) {
        // String name = "";
        System.out.println(name);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(mileagekm);
        System.out.println(auto);
        CarDrive();
        mileage();

    }

    public static void CarDrive() {
        System.out.println("the car is going at the speed" + speed + " km/hr");
    }

    public static void mileage() {
        System.out.println("mileage is very less" + mileagekm + " km/h");
    }

}
