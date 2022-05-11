package com.agc.behavioral.iterator;

public class Driver {

    public static void main(String[] args) {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }


    }
}
