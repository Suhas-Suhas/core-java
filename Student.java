class Student {
    private int id;
    private String name;
    private Address address; // association

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);

        if (address != null) {
            System.out.println("City: " + address.getCity());
            System.out.println("State: " + address.getState());
            System.out.println("Country: " + address.getCountry());
        } else {
            System.out.println("No Address assigned.");
        }
    }
}