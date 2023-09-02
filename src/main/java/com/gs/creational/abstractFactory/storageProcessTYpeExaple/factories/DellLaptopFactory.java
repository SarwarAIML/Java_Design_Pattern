package com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories;

import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.DellProcessor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.Processor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.DellStorage;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.Storage;

public class DellLaptopFactory implements LaptopFactory{

    private int storageSize;
    public DellLaptopFactory(int storageSize) {
        this.storageSize=storageSize;
    }

    public Processor createProcessor() {
        return new DellProcessor();
    }

    public Storage createStorage() {
        return new DellStorage(storageSize);
    }

}
