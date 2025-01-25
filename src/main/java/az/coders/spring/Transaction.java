package az.coders.spring;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
    private int id;
    private double amount;
    private OperationType operationType;
    public Transaction(int id, double amount, OperationType operationType) {
        this.id = id;
        this.amount = amount;
        this.operationType = operationType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return "az.coders.spring.Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", operationType=" + operationType +
                '}';
    }
}
