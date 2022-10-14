package com.ammar.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static void ludo() {
		int max=6;
		int min =1;
		System.out.println("Dice :"+(int)(Math.random()*(max-min+1)));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Choose Player\n1.P1\n2.P2:");
		int turn = Integer.parseInt(input.readLine());
		switch(turn) {
		case 1:
			ludo();
			break;
		case 2:
			ludo();
			break;
		default:
			System.out.println("No Such Player");
		}
	}
}
