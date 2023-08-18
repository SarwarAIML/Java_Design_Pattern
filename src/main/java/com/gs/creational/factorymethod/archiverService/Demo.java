package com.gs.creational.factorymethod.archiverService;

import java.io.File;

public class Demo {
	
	public static void main(String[] args) {
		Archiver arc1 = ArchiverFactory.getArchiver("zip");
		Archiver arc2 = ArchiverFactory.getArchiver("rar");
		Archiver arc21 = ArchiverFactory.getArchiver("rar1");
		
		arc1.archive(new File(""));
		arc2.archive(new File(""));

		
		System.out.println(ArchiverFactory.getArchiver("zip") == arc1);
	}

}
