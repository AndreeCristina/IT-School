package session_10_OOP.challenge.challenge3;

import java.util.List;

public class BankAccount {

    String holderName;
    String accountNumber;
    double balance;
    List<Transaction> transactions;

    public BankAccount(String holderName, String accountNumber, double balance, List<Transaction> transactions) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = transactions;
    }

    public double depositMoney(double amount) {
        this.balance += amount;
        transactions.add(new Transaction(Transaction.TransactionType.DEPOSIT, amount, balance));
        return amount;
    }

    public double withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            transactions.add(new Transaction(Transaction.TransactionType.WITHDRAWAL, amount, balance));
        }
        return amount;
    }

    public double checkBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
