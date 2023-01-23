package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a number " + n + "! = " + factorial);
		sc.close();

	}

}
