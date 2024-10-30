package com.teachmeskills.lesson_9.task1.model.client;

import com.teachmeskills.lesson_9.task1.model.account.Account;
import com.teachmeskills.lesson_9.task1.model.card.BaseCard;

public class LegalClient extends BaseClient{
    private String legalClientNumber;

    public LegalClient(String name, Account[] accounts, BaseCard[] cards, String legalClientNumber) {
        super(name, accounts, cards);
        this.legalClientNumber = legalClientNumber;
    }

}
