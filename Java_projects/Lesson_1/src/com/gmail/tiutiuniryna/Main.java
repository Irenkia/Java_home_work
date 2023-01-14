package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello" + 
		" World! ");
		double a = 5.2;
		double b = 2.1;
		double c = a / b;
		System.out.println(c);
		
	    Scanner sc = new Scanner(System.in);	    
	    System.out.println("Input coffee cost (UAH): ");
	    int coffeeCost = sc.nextInt();
	    System.out.println("Input number of cups: ");
	    int cups = sc.nextInt();
	    int totalSum;

	    totalSum = coffeeCost * cups;
	    System.out.println(totalSum + " UAH");
	    
	    int a1 = 3;
	    double b1 = 1.5;
	    double c1 = a1 + (b1 * 2);
	    System.out.println(c1);

	}

}

