package com.agc.behavioral.command;

import com.agc.behavioral.command.fx.Button;

public class Driver {

    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();
    }
}
