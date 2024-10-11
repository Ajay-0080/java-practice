import java.io.Serializable;
class Employee implements Serializable {
    int roll;
    int empId;
    String empName;
    public Employee(int roll, int empId, String empName) {
        this.roll = roll;
        this.empId = empId;
        this.empName = empName;
    }
}