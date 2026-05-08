package session13.bank;

public class Utils {

    public static double interestCalculator(AccountBank accountBank) {
        return switch (accountBank){
            case ShortTerm shortTerm ->
                    shortTerm.interest();
            case LongTerm longTerm ->
                    longTerm.interest();
            case Current current ->
                    current.interest();
            case null -> throw new IllegalArgumentException("bank is null");
        };
    }
}
