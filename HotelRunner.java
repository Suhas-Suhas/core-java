class HotelRunner {
    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[2];

        Hotel h1 = new Hotel();
        h1.setName("Taj Hotel");
        h1.setLocation("Mumbai");
        hotels[0] = h1;
        Hotel h2 = new Hotel();
        h2.setName("The Leela");
        h2.setLocation("Goa");
        hotels[1] = h2;

        for (int i = 0; i < hotels.length; i++) {
            System.out.println("Hotel " + (i + 1));
            System.out.println(hotels[i].getName());
            System.out.println(hotels[i].getLocation());
            System.out.println();
        }
    }
}
