package com.agc.behavioral.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;



    public void store(Compressor compressor, Filter filter,String fileName){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
