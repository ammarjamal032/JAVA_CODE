package com.ammar.Day_1;
import java.util.*;
public class AutoMorphicNumber {
	static boolean isAutoMorphic(int a) {
		
	int sq = a*a;
	while(a>0) {
		if ( a%10 != sq%10) {
			return false;
		}
		a=a/10;
		sq =sq/10;
	}
		
		return true;
	}
		public static void main(String[] args) throws Exception{
			Scanner input = new Scanner(System.in);
		
				char ch;
				try {
					do {
						System.out.println("Enter a number :");
						int num = input.nextInt();
						
						if(isAutoMorphic(num)) {
							System.out.println("Automorphic Number");
						}
						else {
							System.out.println("Not an automorphic number.");
						}
						System.out.println("do you want to continue(y/n):");
						 ch=input.next().charAt(0);
					}
					while(ch=='y');
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
			input.close();
		}
}
