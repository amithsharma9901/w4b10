package com.ust.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
class S1{
	void disp() throws InterruptedException ,FileNotFoundException {
		
	}
}
public class ExApp4  extends S1{
	@Override
	void disp() throws FileNotFoundException {
		
	}
				//checked exception, compiletime 
	public static  void show() throws InterruptedException,FileNotFoundException
	{
		Thread.sleep(500);
		FileReader f=new FileReader("c:\\javatraining\\agenda.txt");
		
	}
	
	public static void main(String[] args)// throws InterruptedException,FileNotFoundException
	{
		try {
			show();
		} catch (FileNotFoundException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
