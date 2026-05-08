package session12;

public class VisaCard extends AbstractCreditCard {


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
