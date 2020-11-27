package com.sfl.docProcessing.serialGenerator;

import com.sfl.docProcessing.utils.Constants;
import com.sfl.docProcessing.utils.DocumentType;

import java.time.LocalDate;

public class OrderSerialGenerator implements SerialGenerator {
    private int currentId = 0;

    @Override
    public String getNext() {
        return DocumentType.ORDER.getAbbreviation() +
                Constants.SERIAL_NUMBER_SEPARATOR +
                getNextId() +
                Constants.SERIAL_NUMBER_SEPARATOR +
                LocalDate.now();
    }

    private int getNextId() {
        currentId = currentId + 1;
        return currentId;
    }
}
