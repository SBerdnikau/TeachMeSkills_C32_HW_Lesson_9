package com.teachmeskills.lesson_9.task1.model.document;

import com.teachmeskills.lesson_9.task1.model.card.BaseCard;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {
    private int transferAmount;
    private Date transferDate;
    private String fromNumberCard;
    private String toNumberCard;
    private String comment;

    public Check(int transferAmount, Date transferDate, String fromNumberCard, String toNumberCard, String comment) {
        this.transferAmount = transferAmount;
        this.transferDate = transferDate;
        this.fromNumberCard = fromNumberCard;
        this.toNumberCard = toNumberCard;
        this.comment = comment;
    }

    public void showCheckInfo() {
        System.out.println("--CHECK FOR TRANSFER--");
        System.out.println("Amount transfer: " + getTransferAmount() +
                "\nDate transfer: " + getTransferDate() +
                "\nFrom: " + getFromNumberCard() +
                "\nTo: " + getToNumberCard() +
                "\nComment: " + getComment() +"\n");
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public String getFromNumberCard() {
        return fromNumberCard;
    }

    public String getToNumberCard() {
        return toNumberCard;
    }

    public String getComment() {
        return comment;
    }
}