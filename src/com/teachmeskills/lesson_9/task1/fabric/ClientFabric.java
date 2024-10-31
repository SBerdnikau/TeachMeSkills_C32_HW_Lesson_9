package com.teachmeskills.lesson_9.task1.fabric;

import com.teachmeskills.lesson_9.task1.model.account.Account;
import com.teachmeskills.lesson_9.task1.model.card.BaseCard;
import com.teachmeskills.lesson_9.task1.model.client.BaseClient;
import com.teachmeskills.lesson_9.task1.model.client.IndividualClient;
import com.teachmeskills.lesson_9.task1.model.client.LegalClient;

public class ClientFabric {

    public static BaseClient createByCodeClient(int codeClient){
        return  switch (codeClient) {
            case 1 -> new IndividualClient("BIO0-001-H001-G99",
                      new Account[]{AccountFabric.createByCodeAccount(1), AccountFabric.createByCodeAccount(2) },
                      new BaseCard[]{CardFabric.createByCodeCard(1), CardFabric.createByCodeCard(2)},
                    "HB6500987645");
            case 2 -> new LegalClient("LC11-222-111-324",
                    new Account[]{ AccountFabric.createByCodeAccount(3), AccountFabric.createByCodeAccount(4) },
                    new BaseCard[]{ CardFabric.createByCodeCard(3), CardFabric.createByCodeCard(4)},
                    "L61-C12-G23-N22");
            default ->  throw new IllegalArgumentException("Not found value of client. ");
        };
    }

}
