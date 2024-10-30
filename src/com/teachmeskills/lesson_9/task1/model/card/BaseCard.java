package com.teachmeskills.lesson_9.task1.model.card;

import java.util.Date;

public abstract class BaseCard {

    protected String cardNumber;
    protected int cvv;
    protected Date validDate;
    protected String cardHolder;
    protected String currency;
    protected double amount;

    public BaseCard(java.lang.String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validDate = validDate;
        this.cardHolder = cardHolder;
        this.currency = currency;
        this.amount = amount;
    }

    // TODO добавить в метод входной параметр "сумма для трансфера"
    /**
     *  Метод проверки лимита карты перед переводом
     *  Метод должен проверять превышает ли сумма перевода лимит для карты
     *  Для каждой карты должна быть своя реализиция с проверкой лимитов в соотвествии с типом карты
     *
     * @return  true - если сумма перевода укладывается в лимиты
     *          false - если сумма перевода больше лимита для карты
     */
    public abstract boolean checkCardLimitTransfer(int amountForTransfer);

    public void showBaseInfo(){
        System.out.println(cardNumber + " -> " + amount + " -> " + validDate);
    }

    public void addToCard(int amount){
        this.amount += amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withdrawalFromCard(int amount){
        //Реализация проверки на отрицательные значения
        if (amount <= 0 ){
            System.out.println("Не достаточно средств на карте");
        }else {
            this.amount -= amount;
        }



    }

}