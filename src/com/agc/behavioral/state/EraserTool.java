package com.agc.behavioral.state;

public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Erase Something");
    }

    @Override
    public void mouseUp() {
        System.out.println("Done Erasing");
    }
}
