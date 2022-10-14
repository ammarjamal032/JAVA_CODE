package Scenario2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Mobile {
	
	static Mobile mb = new Main();
	@Override
	void bluetooth() {
		
		System.out.println("Bluetooth on..");
		
	}
	public static void main(String[] args) throws NumberFormatException, Exception {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. On Bluetooth.");
		int on = Integer.parseInt(input.readLine());
		switch(on) {
		case 1:
			mb.bluetooth();
			System.out.println("Enter the distance");
			mb.setDistance(Integer.parseInt(input.readLine()));
			if(mb.getDistance()>10) {
				System.out.println("Device is out of range...Can't connect.");
			}
			else {
				System.out.println("press 1. to on 2nd device bluetooth.");
				int on2 = Integer.parseInt(input.readLine());
				switch(on2) {
				case 1:
					mb.bluetooth();
					System.out.println("Connecting Device.");
					
					for(int i=0; i<10;i++) {
						System.out.print("*");
						Thread.sleep(1000);//wait method
					}
					System.out.println("\nDevice Connected.");
					System.out.println("Asking device 1 to access of Gallary. "
							+ "\nPress 1 to accept\nPress 2 to deny.");
					int ch= Integer.parseInt(input.readLine());
					switch(ch) {
					case 1:
						System.out.println("Accepted");
						break;
					case 2:
						System.out.println("Denied.");
					}
					
				}
				
			}
			break;
		}

		
	}

}


// 3. We have Bluetooth in our mobiles to transfer data between two mobile phones within a limited distance.
// If I turn on Bluetooth in both of the mobiles, I can transfer the desired data, but I can’t access the other
// mobile’s information like gallery until and unless I get a permission from the other mobile.
