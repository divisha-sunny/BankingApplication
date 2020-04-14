package com.BAnkingApplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // This system will show an Welcome message to user and display 5 options to the user
    //1) Check balance,2)Deposit 3)Withdraw, 4)Check previous transactions, 5)exit
        BankAccount obj = new BankAccount("xyz", "Sunny");
        obj.showMenu();
    }
}
