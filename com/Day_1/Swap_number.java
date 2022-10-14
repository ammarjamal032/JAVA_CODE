package com.Day_1;

public class Swap_number {
	public static void main(String[] args) {
		int num1= 200;
		 int num2 = 400;
		 int num3;
		 System.out.println("Before swap");
		 System.out.println("num 1 ="+num1);
		 System.out.println("num 2 ="+num2);
		 
		 //    logic
		 //method 1
		 
		 num3=num1;
		 num1=num2;
		 num2=num3;
		 
//		 //method 2
//		 num1=num1*num2;		//20000=100*200
//		 num2=num1/num2;		//100 =20000/200
//		 num1 = num1/num2;		//200=20000/100
		 
		 System.out.println("After Swap");
		 System.out.println("num 1 ="+num1);
		 System.out.println("num 2 ="+num2);
	}
}
