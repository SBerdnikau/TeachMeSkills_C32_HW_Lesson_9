package com.teachmeskills.lesson_9.task1.model.client;

import com.teachmeskills.lesson_9.task1.model.account.Account;
import com.teachmeskills.lesson_9.task1.model.card.BaseCard;

public abstract class BaseClient {
    protected String name;
    protected Account[] accounts;
    protected BaseCard[] cards;

    public BaseClient(String name, Account[] accounts, BaseCard[] cards) {
        this.name = name;
        this.accounts = accounts;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
}
