public class CountryRunner {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("INDIA");

        State[] states = new State[30];

        State state1 = new State();
        state1.setName("Andhra Pradesh");
        state1.setChiefMinister("Chandrababu Naidu");
        states[0] = state1;

        State state2 = new State();
        state2.setName("Arunachal Pradesh");
        state2.setChiefMinister("Pema Khandu");
        states[1] = state2;

        State state3 = new State();
        state3.setName("Assam");
        state3.setChiefMinister("Himanta Biswa Sarma");
        states[2] = state3;

        State state4 = new State();
        state4.setName("Bihar");
        state4.setChiefMinister("Nitish Kumar");
        states[3] = state4;

        State state5 = new State();
        state5.setName("Chhattisgarh");
        state5.setChiefMinister("Vishnu Deo Sai");
        states[4] = state5;

        State state6 = new State();
        state6.setName("Goa");
        state6.setChiefMinister("Pramod Sawant");
        states[5] = state6;

        State state7 = new State();
        state7.setName("Gujarat");
        state7.setChiefMinister("Bhupendra Patel");
        states[6] = state7;

        State state8 = new State();
        state8.setName("Haryana");
        state8.setChiefMinister("Nayab Saini");
        states[7] = state8;

        State state9 = new State();
        state9.setName("Himachal Pradesh");
        state9.setChiefMinister("Sukhvinder Singh Sukhu");
        states[8] = state9;

        State state10 = new State();
        state10.setName("Jharkhand");
        state10.setChiefMinister("Hemant Soren");
        states[9] = state10;

        State state11 = new State();
        state11.setName("Karnataka");
        state11.setChiefMinister("Siddaramaiah");
        states[10] = state11;

        State state12 = new State();
        state12.setName("Kerala");
        state12.setChiefMinister("Pinarayi Vijayan");
        states[11] = state12;

        State state13 = new State();
        state13.setName("Madhya Pradesh");
        state13.setChiefMinister("Mohan Yadav");
        states[12] = state13;

        State state14 = new State();
        state14.setName("Maharashtra");
        state14.setChiefMinister("Eknath Shinde");
        states[13] = state14;

        State state15 = new State();
        state15.setName("Manipur");
        state15.setChiefMinister("N. Biren Singh");
        states[14] = state15;

        State state16 = new State();
        state16.setName("Meghalaya");
        state16.setChiefMinister("Conrad Sangma");
        states[15] = state16;

        State state17 = new State();
        state17.setName("Mizoram");
        state17.setChiefMinister("Lalduhoma");
        states[16] = state17;

        State state18 = new State();
        state18.setName("Nagaland");
        state18.setChiefMinister("Neiphiu Rio");
        states[17] = state18;

        State state19 = new State();
        state19.setName("Odisha");
        state19.setChiefMinister("Mohun Majhi");
        states[18] = state19;

        State state20 = new State();
        state20.setName("Punjab");
        state20.setChiefMinister("Bhagwant Mann");
        states[19] = state20;

        State state21 = new State();
        state21.setName("Rajasthan");
        state21.setChiefMinister("Bhajan Lal Sharma");
        states[20] = state21;

        State state22 = new State();
        state22.setName("Sikkim");
        state22.setChiefMinister("Prem Singh Tamang");
        states[21] = state22;

        State state23 = new State();
        state23.setName("Tamil Nadu");
        state23.setChiefMinister("M. K. Stalin");
        states[22] = state23;

        State state24 = new State();
        state24.setName("Telangana");
        state24.setChiefMinister("Revanth Reddy");
        states[23] = state24;

        State state25 = new State();
        state25.setName("Tripura");
        state25.setChiefMinister("Manik Saha");
        states[24] = state25;

        State state26 = new State();
        state26.setName("Uttar Pradesh");
        state26.setChiefMinister("Yogi Adityanath");
        states[25] = state26;

        State state27 = new State();
        state27.setName("Uttarakhand");
        state27.setChiefMinister("Pushkar Singh Dhami");
        states[26] = state27;

        State state28 = new State();
        state28.setName("West Bengal");
        state28.setChiefMinister("Mamata Banerjee");
        states[27] = state28;

        State state29 = new State();
        state29.setName("Delhi");
        state29.setChiefMinister("Arvind Kejriwal");
        states[28] = state29;

        State state30 = new State();
        state30.setName("Puducherry");
        state30.setChiefMinister("N. Rangasamy");
        states[29] = state30;

        country.setStates(states);

        System.out.println("Country name and its states:");
        System.out.println(country.getName());

        State[] countryStates = country.getStates();
        for (int i = 0; i < countryStates.length; i++) {
            State state = countryStates[i];
            if (state != null) {
                System.out.println(state.getName());
                System.out.println(state.getChiefMinister());
            }
        }
    }
}