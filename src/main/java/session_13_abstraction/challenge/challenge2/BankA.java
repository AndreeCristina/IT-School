package session_13_abstraction.challenge.challenge2;

public class BankA extends Bank {

    private double deposit = 100;

    @Override
    public double getBalance() {
        return deposit;
    }
}