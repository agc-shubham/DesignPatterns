package com.agc.behavioral.state;

public class Driver {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();
        System.out.println("\n");

        var canvas1 = new Canvas();
        canvas1.setCurrentTool(new SelectionTool());
        canvas1.mouseUp();
        canvas1.mouseDown();
        System.out.println("\n");
//        A new tool can be added without any modification following Open Closed Principle
//        Open for extention Closed for modification
//        Adding an Eraser class
        var canvas2 = new Canvas();
        canvas2.setCurrentTool(new EraserTool());
        canvas2.mouseUp();
        canvas2.mouseDown();
    }
}
