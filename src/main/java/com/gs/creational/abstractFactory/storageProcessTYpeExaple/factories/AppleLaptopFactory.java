package com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories;

import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.AppleProcessor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.Processor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.AppleStorage;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.Storage;

public class AppleLaptopFactory implements LaptopFactory{


    private int storageSize;
    public AppleLaptopFactory(int storageSize) {
        this.storageSize = storageSize;
    }
    public Processor createProcessor() {
        return new AppleProcessor();
    }
    public Storage createStorage() {
        return new AppleStorage(storageSize);
    }


}
