package com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor;

import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.Storage;

public interface Processor {

    void attachStorage(Storage storage);
    void printSpecs();
}
