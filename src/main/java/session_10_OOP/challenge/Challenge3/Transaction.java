package session_10_OOP.challenge.Challenge3;

public class Transaction {

    TransactionType type;
    double balanceAfter;
    double amount;

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public Transaction(TransactionType type, double amount, double balanceAfter) {
        this(type, amount);
        this.balanceAfter = balanceAfter;
    }

    public enum TransactionType {
        WITHDRAWAL,
        DEPOSIT
    }
}
