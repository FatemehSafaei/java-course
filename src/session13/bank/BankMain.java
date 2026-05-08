package session13.bank;

public class BankMain {

    public static void main(String[] args) {

        ShortTerm shortTerm = new ShortTerm(100000000,4,1);
        LongTerm longTerm = new LongTerm(20000000,12,5);
        Current current = new Current(400000000,5,3);
        IO.println(Utils.interestCalculator(shortTerm));
        IO.println(Utils.interestCalculator(longTerm));
        IO.println(Utils.interestCalculator(current));
    }
}
