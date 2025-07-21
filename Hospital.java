public class Hospital {
    String name;
    int id;
    int Fee;

    public Hospital() {
        System.out.println("no argument constructor/default constructor");
        this.name = "Mohan";
    }

    public Hospital(String name) {
        System.out.println("parameterized constructor of one parameter");
        this.name = name;

    }

    public Hospital(String name, int id) {
        System.out.println("parameterized constructor of two parameter");
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
