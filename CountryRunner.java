public class CountryRunner {
    public static void main(String args[]) {
        Country country = new Country();
        country.setName("INDIA");
        State[] states = new State[30];
        State state1 = new State();
        state1.setName("KARNATAKA");
        state1.setchiefMinister("SIDDARAMAYYA");
        states[0] = state1;
        country.setStates(states);
        System.out.println("Country names amd its States");
        System.out.println(country.getName());
        State[] countryStates = country.getStates();
        for (int i = 0; i < countryStates.length; i++) {
            State state = countryStates[i];
            if (state != null) {
                System.out.println(state.getName());
            }
        }

    }
}
