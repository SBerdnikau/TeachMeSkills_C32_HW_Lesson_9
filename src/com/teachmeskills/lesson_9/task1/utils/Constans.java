package com.teachmeskills.lesson_9.task1.utils;

// TODO добавить константы для лимитов переводов с карты
// TODO использовать эти константы в методах проверки лимитов по карте перед переводом
public interface Constans {
    int TRANSFER_LIMIT_MASTER_CARD = 600;
    int TRANSFER_LIMIT_VISA_CARD = 400;
    String WARNING_EXCEEDING_LIMIT = "Transfer limit exceeded -> ";
}
