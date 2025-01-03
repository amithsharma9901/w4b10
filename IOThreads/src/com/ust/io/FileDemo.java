package com.ust.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f=new File("C:\\Javatraining");
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		String files[]=f.list();
		
		for(String name: files)
			System.out.println(name);

	}

}
