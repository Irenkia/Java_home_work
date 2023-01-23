package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the triangle a");
		int a = sc.nextInt();
		System.out.println("Enter the side of the triangle b");
		int b = sc.nextInt();
		System.out.println("Enter the side of the triangle c");
		int c = sc.nextInt();
		if((a + b) > c && (c + b) > a && (a + c) > b) {
			System.out.println("Such a triangle exists");
		}else {
			System.out.println("Such a triangle does not exist.");
		}
		
		sc.close();		

	}

}
