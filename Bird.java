public class Bird {
    private String name;
    private int age;

    public Bird() {
        System.out.println("no argument constructor/default constructor");
        this.name = "pigeon";
    }

    public Bird(String name) {
        System.out.println("parameterized constructor of one parameter");
        this.name = name;

    }

    public Bird(String name, int age) {
        System.out.println("parameterized constructor of two parameter");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}