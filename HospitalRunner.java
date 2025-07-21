public class HospitalRunner {

    public static void main(String args[]) {
        Hospital hospital = new Hospital();
        System.out.println(hospital.getName());

        hospital.setName("MOHAN");
        String name = hospital.getName();
        System.out.println(name);
        System.out.println("++++++++++++");
        Hospital Hospital1 = new Hospital("MANU");
        System.out.println(hospital.getName());

    }
}
