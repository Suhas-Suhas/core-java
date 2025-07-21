public class Employee {
    int empId;
    String empName;
    String dept;
    double bonus;
    static {

        System.out.println("Static Block of ClassE Executed");
    }

    public void setEmpId(int e) {
        empId = e;
    }

    public void setEmpName(String n) {
        empName = n;
    }

    public void setDept(String d) {
        dept = d;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public double getBonus() {
        return bonus;
    }
}
