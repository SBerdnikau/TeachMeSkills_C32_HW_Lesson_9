package com.teachmeskills.lesson_9.task1.document_parser.impl;

import com.teachmeskills.lesson_9.task1.document_parser.IParser;

public class TxtDocumentParser implements IParser {

    @Override
    public void parseFile(String fileName) {
        System.out.println("Get data from txt document\n");
    }
}
