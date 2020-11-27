package com.sfl.docProcessing.features;

import com.sfl.docProcessing.utils.Constants;

public interface Printable {

    default void print() {
        print(false, Constants.PRINT_FORMAT_PDF);
    }

    void print(Boolean onCompanyBlank, String format);
}
