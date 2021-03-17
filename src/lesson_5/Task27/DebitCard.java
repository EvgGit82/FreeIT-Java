package lesson_5.Task27;


import lesson_5.Task27.abstracts.Date;
import lesson_5.Task27.abstracts.PersonalAccountCards;
import lesson_5.Task27.enums.CardBrand;
import lesson_5.Task27.enums.CardType;
import lesson_5.Task27.enums.Currency;

public class DebitCard extends PersonalAccountCards {

    public DebitCard(CardBrand CARD_BRAND, String HOLDER_NAME, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        super(CARD_BRAND, HOLDER_NAME, CARD_NUMBER, CURRENCY, DATE, cardAmount);
        this.CARD_TYPE = CardType.DEBIT_CARD;
    }

    public void withdrawCash (double amount){
        if (amount > cardAmount) {
            System.out.println("Transaction unavailable - Not enough money at your account!");
        } else {
            System.out.println(df.format(amount) + " has been withdrawn from your card account");
            cardAmount -= amount;
        }
    }

}