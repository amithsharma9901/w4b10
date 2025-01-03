package com.ust.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DISDEmo {

	public static void main(String[] args) throws IOException{
		
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println(" Enter name and address");
		String name=dis.readLine();
		System.out.println(name);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String address=br.readLine();
		System.out.println(address);
	}

}
