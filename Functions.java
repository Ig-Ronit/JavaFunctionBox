package Functions;

import java.util.*;

public class test_fun1 {
	
//	1st no
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
//	7th
	public void findRaiseValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		System.out.println("Enter Its Power");
		int p = sc.nextInt();
		int val = 1;
		for(int i =1; i<=p; i++) { 
			val = val*n;
		}
		System.out.println("the value of "+n+" to the power"+p+" is "+val);
	}
//	8th
	public void fibonacci () {
		Scanner sc = new Scanner(System.in);
		int a=1,b=0,fib=0;
		System.out.println("Enter The Number Upto Which you want the Fibonacci Series");
		int n =sc.nextInt();
		for(int i = 1 ; i<=n;i++) {
			System.out.print(fib+" ");
			fib =a+b;
			a=b;
			b=fib;
			
		}
	}
//	9th
	public void findGCD() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Two Number to Find its GCD");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		while(n1 != n2) { 
	           if(n1>n2) {
	               n1 = n1 - n2;
	           } else {
	               n2 = n2 - n1;
	           }
	       }
	       System.out.println("GCD is : "+ n1);
		
	}
//	10th
	public void findSigns() {
	       int positive = 0, negative = 0, zeros = 0;
	       System.out.println("Press 1 to continue & 0 to stop");
	       Scanner sc = new Scanner(System.in);
	       int input = sc.nextInt();
	       while(input == 1) {
	           System.out.println("Enter your number : ");
	           int number = sc.nextInt();
	           if(number > 0) {
	               positive++;
	           } else if(number < 0) {
	               negative++;
	           } else {
	               zeros++;
	           }
	           System.out.println("Press 1 to continue & 0 to stop");
	           input = sc.nextInt();
	       }
	       System.out.println("Positives : "+ positive);
	       System.out.println("Negatives : "+ negative);
	       System.out.println("Zeros : "+ zeros);
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
		System.out.println("Enter 7 to Find The Value of One number raise to power of Another");
		System.out.println("Enter 8 to Find The Fibonacci Series");
		System.out.println("Enter 9 to Find The GCD Of two Number");
		System.out.println("Enter 10 to to count Positive , Negative and Zeros from your Number Series");
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
		case 7:{
			obj.findRaiseValue();
			break;
		}
		case 8:{
			obj.fibonacci();
			break;
		}
		case 9:{
			obj.findGCD();
			break;
		}
		case 10:{
			obj.findSigns();
		}
		default: {
			System.out.println("Enter Valid Option");
		}

	}
	
  }

}
