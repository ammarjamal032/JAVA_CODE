package Scenario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Dialpad extends Mobile{
	static Mobile mb = new Dialpad();
	
	void call(String str) {
		str = mb.getMobileNumber();
		System.out.println("Ringing ...");
  
	}
	String concate(String stdCode,String m) {
		return mb.getMobileNumber().concat(stdCode);
		
	}
	 static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
	
		
		System.out.println("Choose \n1.local\n2.STD\n3.ISD");
		int code = Integer.parseInt(in.readLine());
		switch(code)
		{
		case 1:
			String mNum="";
			
			System.out.println("Enter mobile Number:");
			
			mNum = in.readLine();	
			if(mNum.length()==10 ) {
				mb.setMobileNumber(mNum);
				System.out.println("Mobile Number is :"+mb.getMobileNumber());
				
				System.out.println("1.Call.\n2.save Contact.");
				int ch=Integer.parseInt(in.readLine());
				switch(ch) {
					case 1:
						mb.call(mNum); //abstract method 
						
					break;
					
					case 2:
						System.out.println("Enter name :");
						mb.setName(in.readLine());
						System.out.println("Contact saved.");
						break;
				}
			}
			else {
				System.out.println("Enter 10 digit mobile number:");
			}
			break;
		case 2:
			System.out.println("Enter STD code :");
			String STDCode = in.readLine();
			System.out.println("Enter Mobile Number :");
			mb.setMobileNumber(in.readLine());
			if(mb.getMobileNumber().length() == 10) {
				mb.call(mb.concate(STDCode,mb.getMobileNumber()));
			}
			else {
				System.out.println("Enter 10 digit number.");
			}
			break;
		case 3:
			System.out.println("Enter ISD code :");
			String ISDCode = in.readLine();
			System.out.println("Enter Mobile Number :");
			mb.setMobileNumber(in.readLine());
			if(mb.getMobileNumber().length() == 10) {
				mb.call(mb.concate(ISDCode,mb.getMobileNumber()));
			}
			else {
				System.out.println("Enter 10 digit number.");
			}
			break;
			default:
				System.out.println("Wrong Choice..");
			
		}
		
		
		
		
		
	
	
		
		
		
	}
}
