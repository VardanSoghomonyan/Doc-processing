package com.sfl.docProcessing.document;

import com.sfl.docProcessing.employee.Employee;
import com.sfl.docProcessing.features.Notifiable;
import com.sfl.docProcessing.features.Printable;
import com.sfl.docProcessing.serialGenerator.OrderSerialGenerator;
import com.sfl.docProcessing.serialGenerator.SerialGenerator;
import com.sfl.docProcessing.utils.DocumentType;
import com.sfl.docProcessing.utils.Utils;

import java.time.LocalDate;

public class OrderDocument extends Document implements Printable, Notifiable {
    private static final SerialGenerator orderSerialGenerator = new OrderSerialGenerator();

    private Employee assignee;
    private LocalDate orderDate;
    private String orderDescription;


    public OrderDocument(Employee assignee, Employee assigner, String orderDescription) {
        this.assignee = assignee;
        this.orderDate = LocalDate.now();
        this.orderDescription = orderDescription;
        setSerialId(orderSerialGenerator.getNext());
        setDocumentType(DocumentType.ORDER);
        setAssigner(assigner);
    }

    @Override
    public void print(Boolean onCompanyBlank, String format) {
        if (onCompanyBlank) {
            Utils.log("SFL LLC");
        }

        Utils.log(getOrderBody());

        if (format != null) {
            Utils.log("Document format is: " + format);
        }
    }

    @Override
    public void notifyAssignee() {
        Utils.sendEmail(assignee.getEmail(), getOrderBody());
    }

    private String getOrderBody() {
        return "ORDER NO: " + getSerialId()
                + "\nTO: " + assignee.toString()
                + "\nFROM: " + getAssigner().toString()
                + "\nContent: " + orderDescription;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderDescription() {
        return orderDescription;
    }
}
