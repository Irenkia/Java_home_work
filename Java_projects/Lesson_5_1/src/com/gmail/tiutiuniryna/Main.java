package com.gmail.tiutiuniryna;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				counter++;
			}
		}
		System.out.println("The number of odd numbers in the array = " + counter);
	}

}
