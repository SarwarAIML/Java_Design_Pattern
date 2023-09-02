package com.gs.creational.abstractFactory.GUIExample.factories;

import com.gs.creational.abstractFactory.GUIExample.buttons.Button;
import com.gs.creational.abstractFactory.GUIExample.buttons.MacOSButton;
import com.gs.creational.abstractFactory.GUIExample.checkboxes.Checkbox;
import com.gs.creational.abstractFactory.GUIExample.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
