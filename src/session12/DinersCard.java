package session12;

public class DinersCard extends AbstractCreditCard{


    @Override
    boolean isNumOfDigitsValid() {
        return true;
    }

    @Override
    boolean isValidPrefix() {
        return false;
    }

    @Override
    boolean isAccountInGoodStand() {
        return true;
    }
}
