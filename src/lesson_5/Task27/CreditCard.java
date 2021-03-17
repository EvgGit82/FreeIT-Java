package lesson_5.Task27;


import lesson_5.Task27.abstracts.Date;
import lesson_5.Task27.abstracts.PersonalAccountCards;
import lesson_5.Task27.enums.CardBrand;
import lesson_5.Task27.enums.CardType;
import lesson_5.Task27.enums.Currency;

public class CreditCard extends PersonalAccountCards {

    public CreditCard(CardBrand CARD_BRAND, String HOLDER_NAME, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        super(CARD_BRAND, HOLDER_NAME, CARD_NUMBER, CURRENCY, DATE, cardAmount);
        this.CARD_TYPE = CardType.CREDIT_CARD;
    }

    public void withdrawCash (double amount){
        String creditAccountStatusMessage = "";
        if (amount > cardAmount) {
            creditAccountStatusMessage = "Your account balance is negative now. Please refill";
        }
        System.out.printf(df.format(amount) + " has been withdrawn from your card account. %s", creditAccountStatusMessage);
        System.out.println();;
        cardAmount -= amount;
    }

}
