package com.gs.creational.abstractFactory.storageProcessTYpeExaple.storage;

public class AppleStorage implements  Storage{


    private int storageSize;
    public AppleStorage(int storageSize) {
        this.storageSize = storageSize;
        System.out.println(storageSize + "GB SSD will be used");
    }
    @Override
    public void getStorageType() {
        System.out.println("SSD");
    }
    @Override
    public String toString() {
        return storageSize + "GB Solid State Drive";
    }
}
