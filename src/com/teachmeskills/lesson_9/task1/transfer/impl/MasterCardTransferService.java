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

        if (amountTransfer > 0) {
            if (cardFrom.getAmount() >= amountTransfer) {
                if (cardFrom.checkCardLimitTransfer(amountTransfer)){
                    cardFrom.withdrawalFromCard(amountTransfer);
                    cardTo.addToCard(amountTransfer);
                    return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), Constans.STATUS_TRANSFER_SUCCESS);
                }else {
                    return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), Constans.STATUS_TRANSFER_LIMIT + Constans.TRANSFER_LIMIT_MASTER_CARD);
                }
            }else {
                return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), Constans.STATUS_TRANSFER_INSUFFICIENT);
            }
        }else{
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), cardTo.getCardNumber(), Constans.STATUS_TRANSFER_INCORRECT_VALUE);
        }
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, Account accountTo, int amountTransfer) {
        if (amountTransfer > 0) {
            if (cardFrom.getAmount() >= amountTransfer) {
                if (cardFrom.checkCardLimitTransfer(amountTransfer)) {
                    cardFrom.withdrawalFromCard(amountTransfer);
                    accountTo.addToAccount(amountTransfer);
                    return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), Constans.STATUS_TRANSFER_SUCCESS);
                }else {
                    return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), Constans.STATUS_TRANSFER_LIMIT + Constans.TRANSFER_LIMIT_MASTER_CARD);
                }
            }else {
                return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), Constans.STATUS_TRANSFER_INSUFFICIENT);
            }
        }else {
            return new Check(amountTransfer, new Date(), cardFrom.getCardNumber(), accountTo.getAccountNumber(), Constans.STATUS_TRANSFER_INCORRECT_VALUE);
        }
    }
}