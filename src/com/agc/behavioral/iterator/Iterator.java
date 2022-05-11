package com.agc.behavioral.iterator;

public interface Iterator {

    boolean hasNext();
    String current();
    void next();
}

// implements Iterator<generic_datatype>