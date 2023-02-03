package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Draw a rectangle of stars");
		System.out.println("Enter Height");
		int height = sc.nextInt();
		System.out.println("Enter Widht");
		int widht = sc.nextInt();
		printRectangle(height, widht);
		sc.close();
	}

	public static void printRectangle(int height, int widht) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < widht; j++) {
				System.out.print(" * ");
			}
			System.out.println("   ");
		}
	}

}
