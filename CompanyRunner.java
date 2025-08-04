class CompanyRunner {
    public static void main(String[] args) {
        Company[] companies = new Company[2];

        Company c1 = new Company();
        c1.setName("Infosys");
        c1.setSector("IT");
        companies[0] = c1;
        Company c2 = new Company();
        c2.setName("Biocon");
        c2.setSector("Pharma");
        companies[1] = c2;

        for (int i = 0; i < companies.length; i++) {
            System.out.println("Company " + (i + 1));
            System.out.println(companies[i].getName());
            System.out.println(companies[i].getSector());
            System.out.println();
        }
    }
}
