package com.gmail.tiutiuniryna;

public class Main {

	public static void main(String[] args) {
		int ourNumber = 5;
		System.out.println("5 multiplication table");
		for(int i = 1; i <= 10;i++) {
			int result = i * ourNumber;
			System.out.println(i + " * " + ourNumber + " = " + result);
		}

	}

}
