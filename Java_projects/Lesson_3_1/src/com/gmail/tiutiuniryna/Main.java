package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter the third number : ");
		int number3 = sc.nextInt();
		System.out.println("Enter the fourth number : ");
		int number4 = sc.nextInt();
		int maxNanber = number1;
		if (maxNanber < number2) {
			maxNanber = number2;			
		}
		if (maxNanber < number3) {
			maxNanber = number3;			
		}
		if (maxNanber < number4) {
			maxNanber = number4;			
		}
		System.out.println("Max number : " + maxNanber);
	}

}
