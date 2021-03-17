package lesson_5.Task27;


import lesson_5.Task27.abstracts.Date;
import lesson_5.Task27.abstracts.GiftCards;
import lesson_5.Task27.enums.CardBrand;
import lesson_5.Task27.enums.Currency;

public class GiftCard extends GiftCards {

    public GiftCard(CardBrand CARD_BRAND, String CARD_NUMBER, Currency CURRENCY, Date DATE, double cardAmount) {
        super(CARD_BRAND, CARD_NUMBER, CURRENCY, DATE, cardAmount);
    }
}