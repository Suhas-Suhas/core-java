class SchoolRunner {
    public static void main(String[] args) {
        School[] schools = new School[3];

        School s1 = new School();
        s1.setName("Oxford Public School");
        s1.setLocation("Bangalore");
        schools[0] = s1;
        School s2 = new School();
        s2.setName("Greenwood High");
        s2.setLocation("Mysore");
        schools[1] = s2;
        School s3 = new School();
        s3.setName("St. Joseph's School");
        s3.setLocation("Hubli");
        schools[2] = s3;

        for (int i = 0; i < schools.length; i++) {
            System.out.println("School " + (i + 1));
            System.out.println(schools[i].getName());
            System.out.println(schools[i].getLocation());
            System.out.println();
        }
    }
}
