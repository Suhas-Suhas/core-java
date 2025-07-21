public class LaptopRunner {
    public static void main(String args[]) {
        // classname variablename=new classname();
        Laptop laptop = new Laptop();
        laptop.name = "ASUS";
        System.out.println(laptop.name);
        laptop.setName("HP");
        System.out.println(laptop.name);
    }

}
