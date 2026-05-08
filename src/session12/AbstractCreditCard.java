package session12;

public abstract class AbstractCreditCard {

    String cardName;
    int expMM;
    int expYY;

    boolean isExpDtCtValid() {
        return true;
    }
    boolean hasValidChars() {
        return false;
    }
    boolean isValidCheckSum() {
        return false;
    }
    final boolean isValid () {
        return false;
    }

    abstract boolean isNumOfDigitsValid();
    abstract boolean isValidPrefix();
    abstract boolean isAccountInGoodStand();




}
