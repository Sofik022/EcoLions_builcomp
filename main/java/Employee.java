public class Employee {

    private int id;
    private int employeeId;
    private String Name;
    private int deptId;

    public Employee(int id, int employeeId, String Name, int deptId) {
        this.id = id;
        this.employeeId = employeeId;
        this.Name = Name;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {

}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", Name='" + Name + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}