package com.agc.creational.factory;

public class Driver {
    public static void main(String[] args) {
        new ProductsController().listProducts();
        new ProductsSharpController().listProducts();
    }
}
