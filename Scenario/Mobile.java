package Scenario;

public abstract class Mobile {
	abstract void call(String str);
	abstract String concate(String str,String str1);
	private String mobileNumber="";
	private String StdCode;
	private String name;
	
	public String getStdCode() {
		return StdCode;
	}
	public void setStdCode(String stdCode) {
		StdCode = stdCode;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber =mobileNumber;
		
	}
	
	
	
	
}



//
// 1. In a mobile phone, dialing a number would call some method internally which will
// concatenate the numbers and displays it on screen but,
// we don’t know what is happening internally.
//
// 2. When you tap on the call option, it is sending signals to other person’s mobile(whom you are trying to call)
// but we are unaware of it’s implementation.
// 
//
//
// 3. We have Bluetooth in our mobiles to transfer data between two mobile phones within a limited distance.
// If I turn on Bluetooth in both of the mobiles, I can transfer the desired data, but I can’t access the other
// mobile’s information like gallery until and unless I get a permission from the other mobile.
// 
//
//
// 4. We click photographs and record videos using the camera in a mobile phone. Various brands have a plethora of camera modes in a mobile like: split camera/ panaroma /slow-mo. The basic purpose is to click/record, so the functionality of camera is the same in every mobile, whereas the modes enable you to use your camera in different ways.
//
//
// 5.he basic purpose of using a mobile phone is communication. There are several brands in mobiles. So, the brands of a mobile are using this basic functionality(communication) by extending the mobile class functionality and adding their own new features to their respective brands.
//
//
// Write the JAVA code for the above real time examples and present at 10:30 Am Session.
//
