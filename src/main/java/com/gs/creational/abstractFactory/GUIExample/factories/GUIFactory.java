package com.gs.creational.abstractFactory.GUIExample.factories;

import com.gs.creational.abstractFactory.GUIExample.buttons.Button;
import com.gs.creational.abstractFactory.GUIExample.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
