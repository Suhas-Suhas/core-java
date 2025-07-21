public class Laptop {
    String name;
    double price;
    String feature;
    int storage;

    public static void main(String args[]) {
        // classname variablename=new classname();
        Laptop laptop = new Laptop();
        laptop.name = "ASUS";
        System.out.println(laptop.name);
        laptop.setName("HP");
        System.out.println(laptop.name);
        laptop.setName("Lenevo");
        System.out.println(laptop.name);
    }

    public void setName(String laptopName) {
        name = laptopName;
    }

}
