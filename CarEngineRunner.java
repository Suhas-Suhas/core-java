public class CarEngineRunner {
    public static void main(String[] args) {

        Engine engine = new Engine(1000, "Twin Turbo", "Toyota");

        Car1 car1 = new Car1("Toyota", 4, "White", "Power Steering, ABS", "Petrol");
        car1.setEngine(engine);

        System.out.println("=== Car Details ===");
        System.out.println(car1.getName());
        System.out.println(car1.getColor());
        System.out.println(car1.getWheels());
        System.out.println(car1.getFueltype());
        System.out.println(car1.getFeatures());

        Engine e = car1.getEngine();
        System.out.println("=== Engine Details ===");
        System.out.println(e.getName());
        System.out.println(e.getEngineType());
        System.out.println(e.getEngineCC());
    }
}
