package session15;

public class ShortTerm extends BankAccount {


    public ShortTerm(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}
