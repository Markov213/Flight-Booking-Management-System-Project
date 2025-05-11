package org.example;

public class Payment {
    private String paymentId;
    private double amount;
    private String method;
    private String status;
    private String transactionDate;

    public Payment(double amount, String method) {
        this.paymentId = "PAY" + System.currentTimeMillis();
        this.amount = amount;
        this.method = method;
        this.status = "Pending";
        this.transactionDate = java.time.LocalDateTime.now().toString();
    }

    public String getPaymentId() {return paymentId; }
    public double getAmount() { return amount; }
    public String getMethod() { return method; }
    public String getStatus() { return status; }
    public String getTransactionDate() { return transactionDate; }

    public void processPayment() {
        this.status = "Completed";
    }
}