public class Son extends Father {
    private int salary;
    private int numberOfXFriends;

    public Son() {
    }

    public Son(String name, int salary, int numberOfXFriends) {
        this.name = name;
        this.salary = salary;
        this.numberOfXFriends = numberOfXFriends;
    }

    public void getSonDetails() {
        System.out.println("Son details name: " + name + " salary: " + salary + " friends: " + numberOfXFriends);
    }
}
