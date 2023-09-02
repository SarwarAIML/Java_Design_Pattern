package com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories;

import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.Processor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.Storage;

public interface LaptopFactory {

    Processor createProcessor();

    Storage createStorage();
}



