package lesson_5.com.maintasks.Task27.abstracts;

import lesson_5.com.maintasks.Task27.enums.CardBrand;
import lesson_5.com.maintasks.Task27.enums.CardType;
import lesson_5.com.maintasks.Task27.enums.Currency;

public abstract class GiftCards extends BankCard {

    public GiftCards(CardBrand CARD_BRAND, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        super(CARD_BRAND, CARD_NUMBER, CURRENCY, DATE, cardAmount);
        this.CARD_TYPE = CardType.GIFT_CARD;
    }

    public void depositCash (double amount) {
        System.out.println("Card " + CARD_BRAND + ", Card number: " + CARD_NUMBER + " is a " + CARD_TYPE + ". Deposit transactions are unavailable!");
    }

    public void withdrawCash (double amount){
        if (amount > cardAmount) {
            System.out.println("Transaction unavailable - Not enough money at your gift card account!");
        } else {
            System.out.println(df.format(amount) + " has been withdrawn from your gift card account");
            cardAmount -= amount;
        }
    }

}