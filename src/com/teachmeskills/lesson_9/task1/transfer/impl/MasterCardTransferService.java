package com.teachmeskills.lesson_9.task1.transfer.impl;

import com.teachmeskills.lesson_9.task1.model.account.Account;
import com.teachmeskills.lesson_9.task1.model.card.BaseCard;
import com.teachmeskills.lesson_9.task1.model.document.Check;
import com.teachmeskills.lesson_9.task1.transfer.CardTransferService;
import com.teachmeskills.lesson_9.task1.utils.Constans;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class MasterCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, int amountTransfer) {
        if (cardFrom.checkCardLimitTransfer(amountTransfer)) {
            cardFrom.withdrawalFromCard(amountTransfer);
            cardTo.addToCard(amountTransfer);
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), "Sucsess");
        }else {
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), "Transfer limit exceeded. Transfer limit is = " +  Constans.TRANSFER_LIMIT_MASTER_CARD );
        }
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, Account accountTo, int amountTransfer) {
        if (cardFrom.checkCardLimitTransfer(amountTransfer)) {
            cardFrom.withdrawalFromCard(amountTransfer);
            accountTo.addToAccount(amountTransfer);
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), "Sucsess");
        }else {
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), "Transfer limit exceeded. Transfer limit is = " +  Constans.TRANSFER_LIMIT_MASTER_CARD );
        }
    }
}
