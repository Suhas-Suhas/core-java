class IndustryManagerRunner {
    public static void main(String[] args) {
        Industry industry1 = new Industry("TATA Steel", 4567891230L, "Jamshedpur");
        System.out.println("Printing industry details:");
        System.out.println(industry1.getName());
        System.out.println(industry1.getLocation());

        Manager manager = new Manager("Anjali Verma", 120000.0f, "Jamshedpur");
        industry1.setManager(manager);

        Manager fetchedManager = industry1.getManager();
        System.out.println("Printing manager details:");
        System.out.println(fetchedManager.getName());
        System.out.println(fetchedManager.getBranch());
        System.out.println(fetchedManager.getSalary());
    }
}