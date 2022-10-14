package com.ammar.Day_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
public class ReverseProgram {
	public void RevNumber(int num) {
		int rem,rev=0,t;
		t=num;
		//while(num != 0)
		for(;num!=0;num /=10)
		{  
			rem = num % 10;  
			rev = rev * 10 + rem;  
			//num /=10;//for while loop  
		}  
		System.out.println("The reverse of the number is: " + rev);  
		
	} 
	
	void RevString(String str) {
		
		char arr[]=str.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--){
				rev+=arr[i];
			}
		System.out.println("The reverse of the String is :"+rev);
	}
	
	void revWord(String str) {
		Pattern ptr = Pattern.compile("\\s");
		String temp[] =ptr.split(str);
		String rev="";
		for(int i=0;i<temp.length;i++) {
			if(i == temp.length-1) {
				rev =temp[i]+rev;
			}
			else {
				rev=" "+temp[i]+rev;
			}
		}
		System.out.println("Rverse of words is :"+rev);
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ReverseProgram RP = new ReverseProgram();
		System.out.println("What do you want get reverse.\n1.Number.\n2.String");
		int ch= Integer.parseInt(in.readLine());
		switch(ch) {
		case 1: 
			System.out.println("Enter numbers :");
			
			int num = Integer.parseInt(in.readLine());
			RP.RevNumber(num);
			
			break;
		case 2:
			System.out.print("Enter String :");
			String str = in.readLine();	
			RP.RevString(str);
			RP.revWord(str);
			break;
		default:
			System.out.println("Wrong choice.");
		}
	}
}

//WAP to reverse a number,String and words in a sentence.
//
//WAP to find duplicates in an Array and a string.
//
//WAP to demonstrate method overriding.
//
//WAP to print Fibonacci numbers.
//
//WAP to search a particular number in a given array.
