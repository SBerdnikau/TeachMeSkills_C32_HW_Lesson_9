package com.teachmeskills.lesson_9.task1.fabric;

import com.teachmeskills.lesson_9.task1.document_parser.IParser;
import com.teachmeskills.lesson_9.task1.document_parser.impl.DocXDocumentParser;
import com.teachmeskills.lesson_9.task1.document_parser.impl.PdfDocumentParser;
import com.teachmeskills.lesson_9.task1.document_parser.impl.TxtDocumentParser;

public class ParserFabric {

    public static IParser createParser(String fileName){
        // TODO (опционально) * попробовать переписать на конструкцию switch-case, может это будет более ёмкая запись
        if (fileName.isEmpty()){
            throw new IllegalArgumentException("File is null or is empty.");
        }
        if (fileName.endsWith(".docx")) {
             return new DocXDocumentParser();
         } else if (fileName.endsWith(".pdf")) {
             return new PdfDocumentParser();
         } else if(fileName.endsWith(".txt")) {
             return new TxtDocumentParser();
         }else {
             throw new UnsupportedOperationException("Unsupported file: " + fileName);
         }
    }
}