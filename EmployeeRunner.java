public class EmployeeRunner {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpId(101);
        e1.setEmpName("Manu");
        e1.setDept("HR");
        e1.setBonus(5000);

        Employee e2 = new Employee();
        e2.setEmpId(102);
        e2.setEmpName("Madhu");
        e2.setDept("Finance");
        e2.setBonus(7000);

        Employee e3 = new Employee();
        e3.setEmpId(103);
        e3.setEmpName("Mahesh");
        e3.setDept("IT");
        e3.setBonus(9000);

        printEmployee(e1);
        printEmployee(e2);
        printEmployee(e3);
    }

    public static void printEmployee(Employee e) {
        System.out.println("EmpId: " + e.getEmpId() +
                ", Name: " + e.getEmpName() +
                ", Dept: " + e.getDept() +
                ", Bonus: " + e.getBonus());
    }
}
