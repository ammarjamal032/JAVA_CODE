package com.ammar.Day_1;


import java.util.*;
public class Fibanacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1=0,n2=1,n3,num,c=2;
		System.out.println("Enter A number :");
		num=input.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
//		using while loop;
		System.out.print(n1+" "+n2);
		while(c<num) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			c++;
		}
	}
}
