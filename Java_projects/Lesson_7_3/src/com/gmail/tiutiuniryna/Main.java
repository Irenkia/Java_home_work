package com.gmail.tiutiuniryna;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(1, 20);
		}
		System.out.println("Our array");
		System.out.println(Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer from 1 to 20");
		int search = sc.nextInt();

		int index = linearElementSearch(arr, search);
		if (index == -1) {
			System.out.println("The number " + search + " is not in our array");
		} else {
			System.out.println("The number " + search + " is in our array and its index = " + index);
		}

		sc.close();
	}

	public static int linearElementSearch(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}

}
