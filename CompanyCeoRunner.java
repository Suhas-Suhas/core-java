public class CompanyCeoRunner {
    public static void main(String args[]) {
        Company1 company1 = new Company1("infosys", 123456, "Banglore", 2000);
        System.out.println("printing company details");
        System.out.println(company1.getName());

        Ceo ceo = new Ceo("Shreyas", 1000000.0f, "Banglore");
        company1.setCeo(ceo);
        Ceo ceo1 = company1.getCeo();
        System.out.println("printing company ceo details");
        System.out.println(ceo1.getName());
        System.out.println(ceo1.getCity());
        System.out.println(ceo1.getSalary());
    }
}
