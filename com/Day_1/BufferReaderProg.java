package com.Day_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderProg {
	public static void main(String[] args) throws Exception {
		InputStreamReader reader=new InputStreamReader(System.in); 
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter Your college name:");
		String cname =input.readLine();
		
			System.out.println("Your College name is :"+cname);
		
	}
}
