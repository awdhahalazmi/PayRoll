package PayRoll;

public class SalaryCalc {
    private Employee employee;

    public SalaryCalc(Employee employee) {
        this.employee = employee;
    }

    public double calculateTotalSalary(double overtimeHours, double bonus, double deductions) {
        double overtimePay = overtimeHours * (employee.getBasicSalary() / 50);
        double totalSalary = employee.getBasicSalary() + overtimePay + bonus - deductions;
        return totalSalary;
    }

}
