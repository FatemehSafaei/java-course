package session12;

public class Session12 {
    public static void main(String[] args) {

        AbstractCreditCard definerCard = new DinersCard();
        definerCard.isAccountInGoodStand();
        System.out.println(definerCard.isAccountInGoodStand());
        AbstractCreditCard masterCard = new MasterCard();
        masterCard.isValidPrefix();
        System.out.println(masterCard.isValidPrefix());
        AbstractCreditCard visaCard = new VisaCard();
        visaCard.isNumOfDigitsValid();
        System.out.println(visaCard.isNumOfDigitsValid());
    }
}
