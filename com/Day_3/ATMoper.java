package com.Day_3;


import java.util.Scanner;
class ATMoper {
    public static void main( String args[] ) {

        int balance = 4900;
        int withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println( "Welcome to HDFD BanK ATM " );
            System.out.println( "Select 1 for Withdraw" );
            System.out.println( "Select 2 for Deposit" );
            System.out.println( "Select 3 for Check Balance" );
            System.out.println( "Select 4 for EXIT" );
            System.out.print( "Please Enter your choice:" );
            int option = sc.nextInt( );
            switch( option )
            {
                case 1: System.out.print( "Enter the amount to be withdrawn :" );
                    withdraw = sc.nextInt();
                    withdraw( balance, withdraw);

                    break;
                case 2: System.out.print( "Enter the amount to be deposited :" );
                    deposit = sc.nextInt();
                    deposit( balance, deposit );
                    break;
                case 3:
                    printBalance( balance );
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit( 0 );
            }   continue;
        }
    }
    public static void printBalance(int balance)
    {
        System.out.println(" The Current Balance : " + balance);
        System.out.println();
    }
    public static int withdraw(int balance, int withdrawAmount)
    {
        System.out.println( "Withdrawn Operation :" );
        System.out.println("The withdrawing Amount = : " + withdrawAmount);
        if (balance >= withdrawAmount)
        {
            balance = balance - withdrawAmount;
            System.out.println( "Please collect your amount " );
            printBalance( balance );
        }
        else {
            System.out.println("Transaction Declined");
            System.out.println( "Insufficient Amount" );
            System.out.println( );
        }
        return balance;
    }
    public static int deposit(int balance, int depositAmount)
    {
        System.out.println( "Deposit Operation :" );
        System.out.println(" The depositing amount is : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println( "Your Deposit Transaction Successful!!" );
        printBalance(balance);
        System.out.println("Thank You! Visit again");
        return balance;


    }
}


