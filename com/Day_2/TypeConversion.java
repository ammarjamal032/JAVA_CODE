package com.Day_2;

public class TypeConversion {
	public static void main(String[] args) {
		System.out.println("Narrowing");
		double a = 16.333;
		System.out.println("Double value :"+a);
		long l = (long)a;
		System.out.println("Long Value :"+l);
		
		int i = (int)l;
		System.out.println("Int Value :"+i);
		char ch = 'a';
		System.out.println("char value :"+ch);
		int d = ch;
		System.out.println("Ascii value :"+d);
		
		System.out.println("\nWidening");
		
		byte b =10;
		System.out.println("byte value :"+b);
		short s = b;
		System.out.println("short value :"+s);
		int i2= s;
		System.out.println("int value :"+i2);
		double d2=i2;
		System.out.println("Double value :"+d2);
		
	}
}
