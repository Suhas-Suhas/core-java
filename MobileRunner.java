public class MobileRunner {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[3];

        Mobile m1 = new Mobile();
        m1.setModel("Samsung Galaxy");
        m1.setPrice(24999);

        Mobile m2 = new Mobile();
        m2.setModel("iPhone 14");
        m2.setPrice(69999);

        mobiles[0] = m1;
        mobiles[1] = m2;

        for (Mobile mobile : mobiles) {
            if (mobile != null) {
                System.out.println(mobile.getModel());
                System.out.println(mobile.getPrice());
            }
        }
    }
}
