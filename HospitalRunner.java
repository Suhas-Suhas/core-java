class HospitalRunner {
    public static void main(String args[]) {

        Hospital[] hospitals = new Hospital[2];
        Hospital hospital = new Hospital();
        hospital.setName("Jayadeva Hospital");
        hospital.setAddress("Micro Layout");
        System.out.println(hospital.getAddress());
        hospitals[0] = hospital;
        Hospital hospital1 = new Hospital();
        hospital1.setName("Nimhans");
        hospital.setAddress("layout");
        hospitals[1] = hospital1;
        for (int i = 0; i < hospitals.length; i++) {
            Hospital localHospital = hospitals[i];
            System.out.println(localHospital.getName());
            System.out.println(localHospital.getAddress());
        }

    }

}