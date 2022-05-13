package com.agc.structural.proxy;

public class Driver {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a","b","c"};

        for (var fileName: fileNames){
            library.add(new EbookProxy(fileName));
        }



//        for (var fileName: fileNames)
//            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");

    }
}
