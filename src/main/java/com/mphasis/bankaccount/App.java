package com.mphasis.bankaccount;
 
import java.util.Scanner;
 
interface Bank{
	void deposit();
	void withdraw();
	void disp();
}
 
class SavingsAccount implements Bank{
	private int  totamt = 0;
	
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		if(amt>0) {
			totamt = amt+totamt;
		}
		System.out.println("Balance is"+totamt);
 
	}
 
	public void withdraw() {
		
		System.out.println("Enter the amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		if(amt>0 &&amt<totamt) {
			totamt = totamt - amt;
		}
		System.out.println("Total amount is "+totamt);
 
	}
	
	public void disp() {
		System.out.println("Total amount is "+totamt);
	}
	
}
class CheckingAccount implements Bank{
	private int  totamt = 0;
	
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		if(amt>0) {
			totamt = amt+totamt;
		}
		else {
			System.out.println("Enter the correct amount");
		}
		System.out.println("Balance is"+totamt);
 
	}
 
	
	public void withdraw() {
	
		System.out.println("Enter the amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		if(amt>0 &&amt<totamt) {
			totamt = totamt - amt;
		}
		else {
			System.out.println("Enter the correct amount");
		}
		System.out.println("Total amount is "+totamt);
 
	}
	
	public void disp() {
		System.out.println("Total amount is "+totamt);
		System.out.println("Hello World");
	}
}
public class App
{
    public static void main( String[] args )
    {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
        s.disp();

    }
}