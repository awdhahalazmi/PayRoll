package PayRoll;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentHistoryTracker {

    private Employee employeee;
    private List<Payment> paymentHistory;

    public PaymentHistoryTracker(Employee employee) {
        this.employeee = employee;
        this.paymentHistory = new ArrayList<>();
    }

    public void recordPayment(double amount, String paymentMethod) {
        Payment payment = new Payment(new Date(), amount, paymentMethod);
        paymentHistory.add(payment);
    }

    public void displayPaymentHistory() {
        System.out.println("Payment History to: " + employeee.getName() + ": ");
        for (Payment payment : paymentHistory) {
            System.out.println("Date: " + payment.getDate() + "\n Amount: KWD" + payment.getAmount() +
                    ", type:" + payment.getPaymentMethod());
        }
    }

}

class Payment {
    private Date date;
    private double amount;
    private String paymentMethod;

    public Payment(Date date, double amount, String paymentMethod) {
        this.date = date;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
