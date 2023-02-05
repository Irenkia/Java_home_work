package com.gmail.tiutiuniryna;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(-20, 20);
		}
		System.out.println("Our array");
		System.out.println(Arrays.toString(arr));
		int max = findMaxNumber(arr);
		
		System.out.println("Max number in our array");
		System.out.println(max);

	}

	public static int findMaxNumber(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
