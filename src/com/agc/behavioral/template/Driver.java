package com.agc.behavioral.template;

public class Driver {

    public static void main(String[] args) {
        var Task1 = new TransferMoneyTask();
        Task1.execute();

        var Task2 = new GenerateReportTask();
        Task2.execute();
    }
}
