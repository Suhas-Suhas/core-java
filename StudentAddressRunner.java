public class StudentAddressRunner {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Suhas");

        Address addr1 = new Address("Bangalore", "Karnataka", "India");

        s1.setAddress(addr1);

        s1.showDetails();
    }
}