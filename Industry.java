class Industry {
    private String name;
    private long registrationNumber;
    private String location;
    private int employeeCount;
    private Manager manager;

    public Industry() {
    }

    public Industry(String name, long registrationNumber) {
        System.out.println("Initializing name and registration number");
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public Industry(String name, long registrationNumber, String location) {
        this(name, registrationNumber);
        System.out.println("Initializing location");
        this.location = location;
    }

    public Industry(String name, long registrationNumber, String location, int employeeCount) {
        this(name, registrationNumber, location);
        System.out.println("Initializing employee count");
        this.employeeCount = employeeCount;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public String getLocation() {
        return location;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}