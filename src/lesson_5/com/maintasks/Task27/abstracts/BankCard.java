package lesson_5.com.maintasks.Task27.abstracts;


import lesson_5.com.maintasks.Task27.enums.CardBrand;
import lesson_5.com.maintasks.Task27.enums.CardType;
import lesson_5.com.maintasks.Task27.enums.Currency;
import lombok.Getter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

@Getter
public abstract class BankCard {

    protected final CardBrand CARD_BRAND;
    protected final String CARD_NUMBER;
    protected final Currency CURRENCY;
    protected final Date DATE;
    protected double cardAmount;
    protected CardType CARD_TYPE;

    protected DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    protected DecimalFormat df = new DecimalFormat("##.##", symbols);


    public BankCard(CardBrand CARD_BRAND, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        this.CARD_BRAND = CARD_BRAND;
        this.CARD_NUMBER = CARD_NUMBER;
        this.CURRENCY = CURRENCY;
        this.DATE = DATE;
        this.cardAmount = cardAmount;
    }

    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    public void setCARD_TYPE(CardType CARD_TYPE) {
        this.CARD_TYPE = CARD_TYPE;
    }

    public void depositCash(double amount) {
        System.out.println(df.format(amount) + " has been added to your card account");
        cardAmount += amount;
    }

    public void withdrawCash(double amount) {
        System.out.println(df.format(amount) + " has been withdrawn from your card account");
        cardAmount -= amount;
    }

    @Override
    public String toString() {
        return "BankCard [Type: " + CARD_TYPE + ", Name: " + CARD_BRAND + ", Card Number: " + CARD_NUMBER
                + ", Currency: " + CURRENCY + ", Expiration Date: " + DATE + ", Amount: " + df.format(cardAmount) + ']';
    }

   public static class Date {
        private final int MONTH;
        private final int YEAR;

        public Date(int MONTH, int YEAR) {
            this.MONTH = MONTH;
            this.YEAR = YEAR;
        }

        @Override
        public String toString() {
            if (MONTH < 10) {
                return "0" + MONTH + "/" + YEAR;
            } else {
                return MONTH + "/" + YEAR;
            }
        }
    }
}
