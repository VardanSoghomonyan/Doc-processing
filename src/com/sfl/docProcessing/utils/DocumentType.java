package com.sfl.docProcessing.utils;

public enum DocumentType {
    ORDER("ODR"),
    REPORT("RPT"),
    REFERENCE("REF");

    String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    DocumentType(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
