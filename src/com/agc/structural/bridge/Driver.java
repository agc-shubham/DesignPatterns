package com.agc.structural.bridge;

public class Driver {

    public static void main(String[] args) {
        var sonyremoteControl = new RemoteControl(new SonyTV());

        sonyremoteControl.turnOn();
        sonyremoteControl.turnOff();

        var sonyadvremoteControl = new AdvancedRemoteControl(new SonyTV());

        sonyadvremoteControl.turnOn();
        sonyadvremoteControl.setChannel(15);

        var samsungremoteControl = new RemoteControl(new Samsung());

        samsungremoteControl.turnOn();
    }
}
