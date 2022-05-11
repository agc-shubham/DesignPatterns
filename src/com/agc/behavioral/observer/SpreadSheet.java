package com.agc.behavioral.observer;

public class SpreadSheet implements Observer{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void updatePush(int value) {
        System.out.println("Spreadsheet got updated.(Push) Value: "+value);
    }

    @Override
    public void updatePull() {
        System.out.println("Spreadsheet got updated.(Pull) Value: "+dataSource.getValue());
    }
}
