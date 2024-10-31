package com.teachmeskills.lesson_9.task1.model.card;

import com.teachmeskills.lesson_9.task1.utils.Constans;

import java.util.Date;

public class VisaCard  extends BaseCard {

    private int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, int cashback, int amount) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.cashback = cashback;
    }

    @Override
    public boolean checkCardLimitTransfer(double amountForTransfer) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит
        return Constans.TRANSFER_LIMIT_VISA_CARD > amountForTransfer;
    }

    @Override
    public void showBaseInfo() {
        System.out.println("VISACARD-INFO");
        System.out.println(cardNumber + " -> " + amount + " -> "  + validDate + "\n");
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
