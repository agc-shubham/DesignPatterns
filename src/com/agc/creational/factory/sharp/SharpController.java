package com.agc.creational.factory.sharp;

import com.agc.creational.factory.matcha.Controller;
import com.agc.creational.factory.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
