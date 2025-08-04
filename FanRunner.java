public class FanRunner {
    public static void main(String[] args) {
        Fan[] fans = new Fan[3];

        Fan fan1 = new Fan();
        fan1.setBrand("Usha");
        fan1.setSpeed(5);

        Fan fan2 = new Fan();
        fan2.setBrand("Crompton");
        fan2.setSpeed(4);

        fans[0] = fan1;
        fans[1] = fan2;

        for (Fan fan : fans) {
            if (fan != null) {
                System.out.println(fan.getBrand());
                System.out.println(fan.getSpeed());
            }
        }
    }
}
