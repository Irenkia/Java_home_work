package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n (greater than 4 and less than 16)");
		int n = sc.nextInt();
		long factorial = 1;
		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
				
			}
			System.out.println("Factorial of a number " + n + "! = " + factorial);
		} else {
			System.out.println("Invalid number entered");
		}
		

		sc.close();

	}

}
