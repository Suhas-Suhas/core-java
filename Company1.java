public class Company1 {
    private String name;
    private long id;
    private String city;
    private int numberOfEmployees;
    // private String ceoname;
    // private String ceocity;
    // private ceosalary;
    public Ceo ceo;

    public Company1() {

    }

    public Company1(String name, long id) {
        System.out.println("initializing name,id");
        this.name = name;
        this.id = id;

    }

    public Company1(String name, long id, String city) {
        // this.name=name;
        // this.id=id;
        this(name, id);
        System.out.println("initializing city");
        this.city = city;
    }

    public Company1(String name, long id, String city, int employees) {
        this(name, id, city);
        System.out.println("initializing employees");
        this.numberOfEmployees = employees;
    }

    public void setCeo(Ceo ceo) {

        this.ceo = ceo;

    }

    public Ceo getCeo() {
        return ceo;

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
