package _1_ATM_MACHINE;

import java.util.Scanner;

public class _ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 1000; 
		int withdraw;
		int deposit;
		while (true) {
			System.out.println("Welcome to Apna ATM");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose the operation You want to perform");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter money to be withdraw");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Collect Your Money");
				}else {
					System.out.println("Insufficient Balance");
				}
				System.out.println();
				
				
				
				break;
				
				
				
			case 2:
				System.out.println("Enter money to be Deposit");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your amount sucessfully Deposited");
				System.out.println();
				break;
				
			case 3:
				System.out.println("Balance :" + balance);
				System.out.println();
				break;
				
				
			case 4 :
				System.out.println("Thank You For Visiting Apna ATM");
				System.exit(0);
				
				
				
			default:
				System.out.println("Invalid Input");
				System.out.println("Try Again!!! ");
				
				System.out.println();
				break;
			}
		}
		
		
	}

}
