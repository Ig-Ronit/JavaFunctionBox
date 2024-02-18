package Functions;

import java.util.Scanner;

public class test_fun1 {
	
//	1st
	public  void printAverage(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Three Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int avg = (a+b+c)/3 ;
		System.out.println("Average of Three Numbers is:"+avg);
	}
//	2nd
	public  void printSumofOdd() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter The Range For Sum of Odds ");
		int n = sc.nextInt();
		for (int i=1 ; i<= n ; i=i+2) {
			sum = sum + i;
		}
		System.out.println("Sum of First "+n+" Odd Number is :"+sum);
	}
//	3rd
	public void printGreater() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number to Find Greater one ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+" is Greater Number");
		}
		else {
			System.out.println(b+" is Greater Number");	
		}
	}
//	4th
	public void circumference() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius");
		float r = sc.nextFloat();
		double cir = 2 * 3.14 * r;
		System.out.println("The Circumference of a Circle With Radius "+r+" is "+cir);
	}
//	5th
	public void eligibleForVote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("You are not Eligible For Voting :(");
		}
		else if(age>=18 && age<100){
			System.out.println("Congrats!!.. You are Eligible for Voting");
		}
		else {
			System.out.println("You are not a Human, Aren't You ??..");
			System.out.println(" Nowadays, Nobody lives That Longer");
		}
	}
//	6th
	public void infiniteLoop() {
		int n = 1;
		do {
			System.out.println("YOU ARE IN INFINITE LOOP");
			
		} while (n > 0);
		
	}
	
	public static void main(String[] args) {
		test_fun1 obj = new test_fun1();
		Scanner sc = new Scanner(System.in);
		System.out.println("What Function You want to Perform ");
		System.out.println("");
		System.out.println("Enter 1 to Calculate Average of 3 numbers");
		System.out.println("Enter 2 to find Sum of Odd numbers ");
		System.out.println("Enter 3 to find which on is the Greater Number");
		System.out.println("Enter 4 to find Circumfenrecr of a Circle");
		System.out.println("Enter 5 to find if you are Eligible for Voting or not");
		System.out.println("Enter 6 to Caught in Infinite Loop");
		int number = sc.nextInt();
		switch (number) {
		case 1: {
			obj.printAverage();
			break;
		}
		case 2:{
			obj.printSumofOdd();
			break;
		}
		case 3:{
			obj.printGreater();
			break;
		}
		case 4:{
			obj.circumference();
			break;
		}
		case 5:{
			obj.eligibleForVote();
			break;
		}
		case 6:{
			obj.infiniteLoop();
			break;
		}
		default: {
			System.out.println("Enter Valid Option");
		}

	}
	
  }

}
