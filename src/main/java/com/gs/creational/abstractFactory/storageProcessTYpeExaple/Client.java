package com.gs.creational.abstractFactory.storageProcessTYpeExaple;

import com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories.AppleLaptopFactory;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories.DellLaptopFactory;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.factories.LaptopFactory;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.processor.Processor;
import com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage.Storage;

public class Client {

    public static void main(String[] args) {

        Processor dellProcessor = createLaptop(new DellLaptopFactory(1024));
        dellProcessor.printSpecs();
        System.out.println("*****************************************");
        Processor appleProcessor = createLaptop(new AppleLaptopFactory(512));
        appleProcessor.printSpecs();

    }

    // config method that will create an instance of Processor with passed abstract class object
    public static Processor createLaptop(LaptopFactory laptopFactory) {
        Processor processor = laptopFactory.createProcessor();
        Storage storage = laptopFactory.createStorage();
        processor.attachStorage(storage);
        return processor;

    }
}
