package com.teachmeskills.lesson_9.task1;

import com.teachmeskills.lesson_9.task1.document_parser.IParser;
import com.teachmeskills.lesson_9.task1.fabric.AccountFabric;
import com.teachmeskills.lesson_9.task1.fabric.ClientFabric;
import com.teachmeskills.lesson_9.task1.fabric.ParserFabric;
import com.teachmeskills.lesson_9.task1.model.account.Account;
import com.teachmeskills.lesson_9.task1.model.card.BaseCard;
import com.teachmeskills.lesson_9.task1.model.card.MasterCard;
import com.teachmeskills.lesson_9.task1.model.card.VisaCard;
import com.teachmeskills.lesson_9.task1.model.client.BaseClient;
import com.teachmeskills.lesson_9.task1.model.document.Check;
import com.teachmeskills.lesson_9.task1.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_9.task1.transfer.impl.VisaCardTransferService;

import java.util.Scanner;

public class ApplicationRunner {
    public static void main(java.lang.String[] args) {
        // TODO запросить с консоли путь и имя файла
        System.out.print("Enter the path to the file: ");
        Scanner scanner = new Scanner(System.in);
        java.lang.String filePath =  scanner.nextLine();

        // TODO сделать метод createParser статичным и избавиться от необходимости создания объекта parserFabric
        // TODO заменить "" на имя файла, полученное со сканера
        IParser parser = ParserFabric.createParser(filePath);
        parser.parseFile(filePath);

        // TODO реализовать тестовый сценарий
        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        BaseClient client1 = ClientFabric.createByCodeClient(1);
        BaseClient client2 = ClientFabric.createByCodeClient(2);
        BaseCard[] cardsClient1 = client1.getCards();
        BaseCard[] cardsClient2 = client2.getCards();
        MasterCard masterCardClient1 = (MasterCard) cardsClient1[0];
        MasterCard masterCardClient2 = (MasterCard) cardsClient2[0];
        VisaCard visaCardClient2 = (VisaCard) cardsClient2[1];
        Account accountClient1 = AccountFabric.createByCodeAccount(1);

        // перевести с карты одного клиента на карту другого сумму денег
        MasterCardTransferService masterCardTransfer1 = new MasterCardTransferService();
        masterCardClient1.showBaseInfo();
        Check check1 = masterCardTransfer1.transferFromCardToCard(masterCardClient1, masterCardClient2, 700);
        check1.showCheckInfo();
        masterCardClient1.showBaseInfo();

        // перевести с карты одного клиента на счет, другого клиента сумму денег
        VisaCardTransferService visaCardTransferS1 = new VisaCardTransferService();
        visaCardClient2.showBaseInfo();
        Check check2 = visaCardTransferS1.transferFromCardToAccount(visaCardClient2, accountClient1, 100);
        check2.showCheckInfo();
        visaCardClient2.showBaseInfo();
    }
}
