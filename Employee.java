package PayRoll;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double Basesalary;

    public Employee(int employeeId, String name, String position, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.Basesalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return Basesalary;
    }

    public void setBasicSalary(double baseSalary) {
        this.Basesalary = baseSalary;
    }

}