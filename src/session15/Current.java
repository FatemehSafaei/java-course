package session15;

public class Current extends BankAccount {


    public Current(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}
