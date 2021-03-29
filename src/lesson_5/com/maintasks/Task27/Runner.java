package lesson_5.com.maintasks.Task27;

/*
Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.
*/

import lesson_5.com.maintasks.Task27.abstracts.BankCard;
import lesson_5.com.maintasks.Task27.enums.CardBrand;
import lesson_5.com.maintasks.Task27.enums.Currency;

public class Runner {
    public static void main(String[] args) {

        BankCard card1 = new GiftCard(CardBrand.MASTERCARD, "2222 0011 0011 1234", Currency.BYN,
                new BankCard.Date(5, 22), 300.00);
        BankCard card2 = new CreditCard(CardBrand.VISA_GOLD, "Ivan Ivanov", "1245 0011 0011 4599",
                Currency.EUR, new BankCard.Date(11, 23), 500.00);
        BankCard card3 = new DebitCard(CardBrand.VISA_CLASSIC, "Roman Kashenok", "9788 0011 0111 5461",
                Currency.USD, new BankCard.Date(9, 24), 800);

        System.out.println("For Gift Cards: ");
        System.out.println(card1.toString());
        card1.depositCash(55.55);
        card1.withdrawCash(1000);
        System.out.println(card1.toString());

        System.out.println();

        System.out.println("For Credit Cards: ");
        System.out.println(card2.toString());
        card2.depositCash(55.55);
        card2.withdrawCash(1000);
        System.out.println(card2.toString());

        System.out.println();

        System.out.println("For Debit Cards: ");
        System.out.println(card3.toString());
        card3.depositCash(55.55);
        card3.withdrawCash(1000);
        System.out.println(card3.toString());
    }
}
