package session13.bank;

public final class LongTerm extends AccountBank {

    public LongTerm(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}
