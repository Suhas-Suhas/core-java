public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Car c1 = new Car();
        c1.setName("Honda City");
        c1.setFuelType("Petrol");

        Car c2 = new Car();
        c2.setName("Tata Nexon");
        c2.setFuelType("Diesel");

        cars[0] = c1;
        cars[1] = c2;

        for (Car car : cars) {
            if (car != null) {
                System.out.println(car.getName());
                System.out.println(car.getFuelType());
            }
        }
    }
}
