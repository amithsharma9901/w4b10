package com.ust.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream f1=new FileInputStream("C:\\Javatraining\\readme.txt");
		FileOutputStream f2=new FileOutputStream("C:\\Javatraining\\out2.txt");
		int k;
		
		while((k=f1.read())!=-1) {//EOF
			System.out.print((char)k);
			f2.write((char)k);
		}
		f1.close();
		f2.close();
	}

}
