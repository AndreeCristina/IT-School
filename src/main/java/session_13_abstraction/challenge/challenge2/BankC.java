package session_13_abstraction.challenge.challenge2;

public class BankC extends Bank {

    private double deposit = 200;

    @Override
    public double getBalance() {
        return deposit;
    }
}