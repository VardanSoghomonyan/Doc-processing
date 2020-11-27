package com.sfl.docProcessing.document;

import com.sfl.docProcessing.employee.Employee;
import com.sfl.docProcessing.utils.DocumentType;

public abstract class Document {
    private String serialId;
    private DocumentType documentType;
    private Employee assigner;
//    private Boolean isPersonalized = true;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Employee getAssigner() {
        return assigner;
    }

    public void setAssigner(Employee assigner) {
        this.assigner = assigner;
    }

//    public Boolean getPersonalized() {
//        return isPersonalized;
//    }
//
//    public void setPersonalized(Boolean personalized) {
//        isPersonalized = personalized;
//    }
}
