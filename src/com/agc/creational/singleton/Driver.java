package com.agc.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        var manager = ConfigManager.getInstance();

        manager.set("name","Shubham");

        var other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
