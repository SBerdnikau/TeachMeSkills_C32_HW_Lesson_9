package com.teachmeskills.lesson_9.task1.utils;

// TODO добавить константы для лимитов переводов с карты
// TODO использовать эти константы в методах проверки лимитов по карте перед переводом
public interface Constans {
    double TRANSFER_LIMIT_MASTER_CARD = 1000;
    double TRANSFER_LIMIT_VISA_CARD = 1001;
    String STATUS_TRANSFER_SUCCESS = "Success";
    String STATUS_TRANSFER_INCORRECT_VALUE = "Incorrect value";
    String STATUS_TRANSFER_INSUFFICIENT = "Insufficient funds on the card";
    String STATUS_TRANSFER_LIMIT =  "Limits have been exceeded. The transfer limit for this card is: ";
}
