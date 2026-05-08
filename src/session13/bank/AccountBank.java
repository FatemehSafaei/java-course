package session13.bank;

public sealed abstract class AccountBank permits ShortTerm,LongTerm,Current {
    public double amount;
    public double rate;
    public double time;


    public AccountBank(double amount, double rate, double time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }

    public abstract double interest();
}
