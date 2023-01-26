package com.gmail.tiutiuniryna;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();

		int[] arr1 = new int[15];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rn.nextInt(1, 20);
		}

		int[] arr2 = new int[arr1.length * 2];
		arr2 = Arrays.copyOfRange(arr1, 0, arr2.length);

		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1.length + i] = arr1[i] * 2;
		}

		System.out.println("This is our 1 array " + Arrays.toString(arr1));
		System.out.println("This is our 2 array " + Arrays.toString(arr2));
	}

}
