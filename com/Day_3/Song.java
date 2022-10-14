package com.Day_3;


public class Song {
	public static void main(String[] args) {
        int counter=0;
        int avail = 10;
        System.out.println("Welcome to Music Player");

        System.out.println("Number of Available Song     "+avail);

        for(int song=1;song<=10;song++)
        {

            counter= counter+1;
            System.out.println("Song "+counter+" is Playing..........");
        }
        System.out.println("Song List is Over");



    }
}