package com.HCL.Day_12;


abstract class Sum{
	   
	   public abstract int sumOfTwo(int n1, int n2);
	   public abstract int sumOfThree(int n1, int n2, int n3);

	}

class Abstraction_Concept extends Sum{

	   public int sumOfTwo(int num1, int num2){
		return num1+num2;
	 }
	   
	   public int sumOfThree(int num1, int num2, int num3){
		return num1+num2+num3;
	 }
	   public static void main(String args[]){
		Sum obj = new Abstraction_Concept();
		
		System.out.println(obj.sumOfTwo(3, 7));
		
		System.out.println(obj.sumOfThree(4, 3, 19));
		
	 }
}