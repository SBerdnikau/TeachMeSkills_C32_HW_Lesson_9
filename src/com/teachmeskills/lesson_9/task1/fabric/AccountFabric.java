package com.teachmeskills.lesson_9.task1.fabric;

import com.teachmeskills.lesson_9.task1.model.account.Account;

public class AccountFabric {

    public static Account createByCodeAccount(int codeAccount){
        return switch (codeAccount) {
            case 1 -> new Account("B00-B11-D11-444", 2000);
            case 2 -> new Account("A01-B02-876-234", 2500);
            case 3 -> new Account("111-222-546-999", 5000);
            case 4 -> new Account("222-234-543-655", 10000);
            default ->  throw new IllegalArgumentException("Not found ."); //обработать
        };
    }

}
