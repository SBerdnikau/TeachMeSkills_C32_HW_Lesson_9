package com.teachmeskills.lesson_9.task1.fabric;

import com.teachmeskills.lesson_9.task1.model.card.BaseCard;
import com.teachmeskills.lesson_9.task1.model.card.MasterCard;
import com.teachmeskills.lesson_9.task1.model.card.VisaCard;

import java.util.Date;

public class CardFabric {

    public static BaseCard createByCodeCard(int cardCode){
        return switch (cardCode) {
             case 1 -> new MasterCard("001-111-123-534", 111, new Date(), "SERGEY", "BYN", "BLR", 2500);
             case 2 -> new VisaCard("002-345-222-221", 122, new Date(), "SERGEY", "USD", 1, 3000  );
             case 3 -> new MasterCard( "222-432-222-111", 222, new Date(), "KATE", "BYN", "BLR", 7500);
             case 4 -> new VisaCard(  "222-432-000-399", 876, new Date(), "KATE", "USD", 2, 12000 );
             default ->  throw new IllegalArgumentException("Not found value of card ");
        };
    }

}