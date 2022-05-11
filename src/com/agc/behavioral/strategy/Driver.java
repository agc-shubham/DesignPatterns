package com.agc.behavioral.strategy;

public class Driver {
    public static void main(String[] args) {
        var imageStore = new ImageStorage();
        imageStore.store(new JpegCompressor(),new BlackAndWhiteFilter(),"A");
        imageStore.store(new PngCompressor(),new HighContrastFilter(),"A");
    }
}
