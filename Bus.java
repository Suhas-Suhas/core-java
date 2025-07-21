public class Bus {
    static char busSeries = 'A';
    static short busNumber = 5467;
    static float mileage = 50;
    static int numberOfPassengers = 20;
    static int ticketPrice = 15;

    public static int getTotalPrice(int numberOfBuses) {
        int totalprice = numberOfPassengers * numberOfBuses;
        return totalprice;

    }

    public static int totalAmountInTrip() {
        int totalAmountInTrip = numberOfPassengers * ticketPrice;
        return totalAmountInTrip;
    }

}
