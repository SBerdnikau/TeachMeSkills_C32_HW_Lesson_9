package com.teachmeskills.lesson_9.task1.model.card;

import com.teachmeskills.lesson_9.task1.utils.Constans;

import java.util.Date;

public class MasterCard extends BaseCard {

    private String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country, int amount) {
        super(cardNumber, cvv, validDate,  cardHolder, currency, amount);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double amountForTransfer) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит
        return Constans.TRANSFER_LIMIT_MASTER_CARD > amountForTransfer;
    }

    @Override
    public void showBaseInfo() {
        System.out.println("MASTERCARD-INFO");
        System.out.println(cardNumber + " -> " + amount + " -> "  + validDate + "\n");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}