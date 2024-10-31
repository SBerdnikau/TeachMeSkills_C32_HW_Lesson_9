package com.teachmeskills.lesson_9.task1.document_parser.impl;

import com.teachmeskills.lesson_9.task1.document_parser.IParser;

public class PdfDocumentParser implements IParser {

    @Override
    public void parseFile(String fileName) {
        System.out.println("Get data from pdf document: " + fileName + "\n");
    }
}
