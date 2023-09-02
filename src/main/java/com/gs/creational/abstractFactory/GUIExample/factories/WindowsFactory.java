package com.gs.creational.abstractFactory.GUIExample.factories;

import com.gs.creational.abstractFactory.GUIExample.buttons.Button;
import com.gs.creational.abstractFactory.GUIExample.buttons.WindowsButton;
import com.gs.creational.abstractFactory.GUIExample.checkboxes.Checkbox;
import com.gs.creational.abstractFactory.GUIExample.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
