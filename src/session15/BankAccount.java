package session15;

public class BankAccount implements IBank{

    public double amount;
    public double rate;
    public double time;


    public BankAccount(double amount, double rate, double time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public double interest() {
        return 0;
    }
}
