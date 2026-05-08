package session13.bank;

public final class ShortTerm extends AccountBank {


    public ShortTerm(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}
