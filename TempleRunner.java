public class TempleRunner {
    public static void main(String args[]) {
        Temple[] temples = new Temple[5];
        Temple temple1 = new Temple();
        temple1.setName("Dodda Ganesha Temple");
        temple1.setAddress("Basavanagudi");

        Temple temple2 = new Temple();
        temple2.setName("Circle maramma");
        temple2.setAddress("Malleshwaram");
        for (int i = 0; i < temples.length; i++) {
            if (i == 0) {
                temples[i] = temple1;
            } else if (i == 1) {
                temples[i] = temple2;
            }
        }
        for (int i = 0; i < temples.length; i++) {
            Temple temple = temples[i];
            if (temple != null) {
                System.out.println(temple.getName());
                System.out.println(temple.getAddress());
            }
        }
    }

}
