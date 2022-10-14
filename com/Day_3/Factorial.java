package com.Day_3;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= input.nextInt();
	int f=1;
		for(int i=1;i<=num;) {
			f=f*i;
			i++;
		}
		System.out.println("Factorial of "+num+ " is "+f);
		
		//reverse of number
		
		for(int i=num;i>=1;) {
			f=f*i;
			i--;
		}
		System.out.println("Factorial of "+num+ " is "+f);
	}

}
