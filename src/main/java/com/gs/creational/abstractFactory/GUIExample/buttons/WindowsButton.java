package com.gs.creational.abstractFactory.GUIExample.buttons;

public class WindowsButton implements Button {
    @Override
    public void print() {
        System.out.println("You have created Window Button");
    }
}
