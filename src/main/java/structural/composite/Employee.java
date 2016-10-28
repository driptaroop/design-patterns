package structural.composite;

import java.util.List;

/**
 * Created by drdas on 28/10/16.
 */
public class Employee {
    private int empId;
    private String empName;
    private List<Employee> subordinates;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        String str = "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'';
        if (null != subordinates && !subordinates.isEmpty()) {
            str += ", [subordinates == ";
            for(Employee employee : subordinates) {
                str += ", subordinates=" + employee +
                        '}';
            }
            str += "]";
        }
        return str;
    }
}
