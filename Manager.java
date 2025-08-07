class Manager {
    private String name;
    private float salary;
    private String branch;

    public Manager(String name, float salary, String branch) {
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getBranch() {
        return branch;
    }
}