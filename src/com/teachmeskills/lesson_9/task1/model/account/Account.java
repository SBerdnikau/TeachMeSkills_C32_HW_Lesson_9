package com.teachmeskills.lesson_9.task1.model.account;

public class Account {

    private String accountNumber;
    private double amount;

    public Account(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void addToAccount(int amount){
        this.amount += amount;
    }

    public void withdrawalFromAccount(int amount){
        this.amount -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }
}