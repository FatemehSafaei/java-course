package session13.bank;

public final class Current extends AccountBank {


    public Current(double amount, double rate, double time) {
        super(amount, rate, time);
    }

    @Override
    public double interest() {
        return (amount * rate * time) / 100;
    }
}
