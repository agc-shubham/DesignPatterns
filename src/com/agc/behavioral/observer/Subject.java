package com.agc.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserversPush(int value){
        for(var observer:observers){
                observer.updatePush(value);
        }
    }
    public void notifyObserversPull(){
        for(var observer:observers){
            observer.updatePull();
        }
    }
}
