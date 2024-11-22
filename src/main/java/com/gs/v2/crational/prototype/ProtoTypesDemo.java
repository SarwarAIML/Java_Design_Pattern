package com.gs.v2.crational.prototype;



import java.io.File;

/**
 * steps :
 * 1) add clone method to hierarchy of object and implements that interface clone method
 * in different classes
 * 2) design a registry that maintain a cache of prototype object
 * 3)Design a api that allows to clone an object inside the factory method
 * and return the new object as a result
 */
public class ProtoTypesDemo {

    public static void main(String[] args) {
        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver = ArchiverFactory.getPrototypesFor(archiverType1);
        Archiver rarArchiver = ArchiverFactory.getPrototypesFor(archiverType2);

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));
    }
}
