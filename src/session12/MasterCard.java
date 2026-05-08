package session12;

public class MasterCard extends AbstractCreditCard {


    @Override
    boolean isNumOfDigitsValid() {
        return false;
    }

    @Override
    boolean isValidPrefix() {
        return false;
    }

    @Override
    boolean isAccountInGoodStand() {
        return false;
    }
}
