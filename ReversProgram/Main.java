package ReversProgram;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
public class Main {
	
	
	//using array
	void RevString(String str) {
		
		char arr[]=str.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--){
				rev+=arr[i];
			}
		System.out.println("The reverse of the String is :"+rev);
	}
	
	
	// using charAt
	void method2(String str) {
		char ch;
		String str1="";
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i); 
	        str1= ch+str1; 
		}
		System.out.println(str1);
	}
	
	
	//Using reverse method
	void method3(String str) {  
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.println(str1);
	}
	
	void method4(String str) {
		char[] str1 = str.toCharArray();
		  
        for (int i = str1.length - 1; i >= 0; i--) {
        	System.out.print(str1[i]);
        }
            
	}
	void method5(String str) {
		StringBuffer str1 = new StringBuffer(str);
        // To reverse the string
        str1.reverse();
        System.out.println(str1);
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
		System.out.println("Reverse of words is :"+rev);
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main RP = new Main();
		System.out.println("Enter String :");
		String str = in.readLine();	
		System.out.println("What do you want get reverse.\n1.letter.\n2.words");
		int ch= Integer.parseInt(in.readLine());
		switch(ch) {
		case 1: 
			RP.RevString(str);
			RP.method2(str);
			RP.method3(str);
			break;
		case 2:
			RP.revWord(str);
			break;
		default:
			System.out.println("Wrong choice.");
		}
	}
}
