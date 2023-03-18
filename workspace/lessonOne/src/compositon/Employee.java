package compositon;

public class Employee {
    private long employeeId;
    private String employeeName;
    private double mounthSalary;
    private Department department;

    public Employee(){}

    public Employee(long employeeId, String employeeName, double mounthSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.mounthSalary = mounthSalary;
    }



    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMounthSalary() {
        return mounthSalary;
    }

    public void setMounthSalary(double mounthSalary) {
        this.mounthSalary = mounthSalary;
    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



}
