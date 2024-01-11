package PayRoll;

public class Main {
    public static void main(String[] args) {
        Employee Awdhah = new Employee(50176, "Awdhah", "Engineer", 3500);

        System.out.println("The Employee ID: " + Awdhah.getEmployeeId());
        System.out.println("Name: " + Awdhah.getName());
        System.out.println("Position: " + Awdhah.getPosition());
        System.out.println("Salary: KWD" + Awdhah.getBasicSalary());

        // Employee Awdhah = new Employee(50176, "Awdhah Alazmi", "Engineer", 3500);
        SalaryCalc calculate = new SalaryCalc(Awdhah);

        double overtimeHours = 8;
        double bonus = 2200;
        double deductions = 10;

        double totalSalary = calculate.calculateTotalSalary(overtimeHours, bonus, deductions);
        System.out.println(" Salary for " + Awdhah.getName() + " is " + ": KWD" + totalSalary);
        Employee Haya = new Employee(50178, "Haya Alqahtani", "Engineer", 3500);
        PaymentHistoryTracker paymentTracker = new PaymentHistoryTracker(Haya);

        paymentTracker.recordPayment(500, " Deposit");
        paymentTracker.recordPayment(200, "Check");
        paymentTracker.displayPaymentHistory();
        System.out.println("The Employee ID: " + Haya.getEmployeeId());
        System.out.println("Name: " + Haya.getName());
        System.out.println("Position: " + Haya.getPosition());
        System.out.println("Salary: KWD" + Haya.getBasicSalary());

    }

}