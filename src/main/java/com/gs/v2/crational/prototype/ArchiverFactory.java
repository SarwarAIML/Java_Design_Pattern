package com.gs.v2.crational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

    private static Map<String,Archiver> prototypes= new HashMap<>();

    static {
        prototypes.put("zip",new ZipArchiver());
        prototypes.put("rar",new RarArachiver());
    }
    public static Archiver getPrototypesFor(String protoTypes){
        return prototypes.get(protoTypes).clone();
    }

}
