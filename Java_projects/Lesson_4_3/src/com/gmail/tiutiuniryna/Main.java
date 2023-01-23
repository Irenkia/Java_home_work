package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the rectangle");
		int height = sc.nextInt();
		System.out.println("Enter the width  of the rectangle");
		int width = sc.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
