package com.agc.creational.factory;

import com.agc.creational.factory.matcha.Controller;
import com.agc.creational.factory.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
        public void listProducts(){
//             Get products from a database
            Map<String, Object> context = new HashMap<>();
//            context.put(products)
            render("products.html", context);
        }
}
