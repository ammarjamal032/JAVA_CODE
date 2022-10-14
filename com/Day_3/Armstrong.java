package com.Day_3;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number :");
		int oNum = input.nextInt();
		int num = oNum;
		int r , t=0;
		while(num!=0) {
			r=num%10;
			t+=r*r*r;
			num/=10;
		}
		if(t == oNum) {
			System.out.println(oNum+" Number is an armstrong ");
		}
		else {
			System.out.println(oNum+"Number is not armstrong ");
		}
	}
}
