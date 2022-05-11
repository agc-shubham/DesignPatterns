package com.agc.behavioral.observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void updatePush(int value) {
        System.out.println("Chart got updated.(Push) Value: "+value);
    }

    @Override
    public void updatePull() {
        System.out.println("Chart got updated.(Pull) Value: "+dataSource.getValue());
    }
}
