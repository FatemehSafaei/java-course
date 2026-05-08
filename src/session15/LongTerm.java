package session15;

public class LongTerm extends BankAccount {

    public LongTerm(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}

