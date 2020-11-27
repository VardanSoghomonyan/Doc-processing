package com.sfl.docProcessing;

import com.sfl.docProcessing.document.OrderDocument;
import com.sfl.docProcessing.employee.Employee;

import static com.sfl.docProcessing.utils.Utils.errorLog;
import static com.sfl.docProcessing.utils.Utils.log;

public class Main {

    public static void main(String[] args) {
        short a= 1;
        short b = 1;
        int c = a+b;
        Long d = 123232312L;
        int f = 1200000000;
        int k = f*100;

        Employee assignee = new Employee("Vardan", "Soghomonyan", "QA Engineer");
        Employee assigner = new Employee("Anun", "Azganun", "QA Engineer", "anun@mail");

        log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        OrderDocument orderDocument_1 = new OrderDocument(assignee, assigner, "TEST QA-1647 TASK");
        orderDocument_1.print();

        log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        OrderDocument orderDocument_2 = new OrderDocument(assignee, assigner, "TEST QA-1657 TASK");
        orderDocument_2.print(true, "DOC");
        errorLog();
    }
}
