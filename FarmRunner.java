class FarmRunner {
    public static void main(String[] args) {
        Farm[] farms = new Farm[5];

        Farm f1 = new Farm();
        f1.setName("Green Valley Farm");
        f1.setAddress("Mandya");
        farms[0] = f1;
        Farm f2 = new Farm();
        f2.setName("Sunrise Farm");
        f2.setAddress("Tumkur");
        farms[1] = f2;
        Farm f3 = new Farm();
        f3.setName("Harmony Acres");
        f3.setAddress("Hassan");
        farms[2] = f3;
        Farm f4 = new Farm();
        f4.setName("Silverleaf Farm");
        f4.setAddress("Chikkamagalur");
        farms[3] = f4;
        Farm f5 = new Farm();
        f5.setName("Golden Harvest");
        f5.setAddress("Raichur");
        farms[4] = f5;

        for (int i = 0; i < farms.length; i++) {
            System.out.println("Farm " + (i + 1));
            System.out.println(farms[i].getName());
            System.out.println(farms[i].getAddress());
            System.out.println();
        }
    }
}
