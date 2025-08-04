public class Hospital {
    private String name;
    private String address;
    private int HospitalNumber;
    int[] numberOfPatientWard = { 10, 20, 30, 40, 50 };
    int[] numberOfBedCounts = { 2, 3, 5, 6, 4 };
    static String[] DoctorsNames = { "manu", "madhu", "Mahesh" };

    public static String[] getDoctorsName() {
        return DoctorsNames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}