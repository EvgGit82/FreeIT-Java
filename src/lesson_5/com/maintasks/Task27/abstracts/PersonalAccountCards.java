package lesson_5.com.maintasks.Task27.abstracts;


import lesson_5.com.maintasks.Task27.enums.CardBrand;
import lesson_5.com.maintasks.Task27.enums.Currency;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PersonalAccountCards extends BankCard {

    protected String HOLDER_NAME;

    public PersonalAccountCards(CardBrand CARD_BRAND, String HOLDER_NAME, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        super(CARD_BRAND, CARD_NUMBER, CURRENCY, DATE, cardAmount);
        this.HOLDER_NAME = HOLDER_NAME;
    }

    @Override
    public String toString() {
        return "BankCard [Type: " + CARD_TYPE + ", Name: " + CARD_BRAND + ", Card Holder: " + HOLDER_NAME + ", Card Number: " + CARD_NUMBER
                + ", Currency: " + CURRENCY + ", Expiration Date: " + DATE + ", Amount: " + df.format(cardAmount) + ']';
    }

}