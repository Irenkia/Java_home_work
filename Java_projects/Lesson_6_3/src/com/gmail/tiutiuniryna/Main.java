package com.gmail.tiutiuniryna;

public class Main {

	public static void main(String[] args) {
		int n = 2;
		int size = 10;
		for (int i = 0; i < size; i++) {
			String result = String.format((i + 1) + " - the value of Pi - %." + n + "f", Math.PI);
			System.out.println(result);
			n++;
		}

	}

}
