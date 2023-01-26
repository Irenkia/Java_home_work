package com.gmail.tiutiuniryna;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 5 and 10 inclusive for the size of the array");
		int size = sc.nextInt();
		if (size >= 5 && size <= 10) {
			System.out.println("Your array will have elements: array[" + size + "]");
			System.out.println();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter array element " + (i + 1));
				arr[i] = sc.nextInt();
			}
			System.out.println("You have created an array like this " + Arrays.toString(arr));
		} else {
			System.out.println("Invalid number entered");
		}

		sc.close();

	}

}
