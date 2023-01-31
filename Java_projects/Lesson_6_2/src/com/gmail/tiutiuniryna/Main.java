package com.gmail.tiutiuniryna;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string from words separated by spaces");
		String str = sc.nextLine();
		String[] strArray = str.split("['']");
		System.out.println(Arrays.toString(strArray));
		String word = "";
		for (int i = 0; i < strArray.length; i++) {
			if (word.length() < strArray[i].length()) {
				word = strArray[i];
			}

		}
		System.out.println("The longest word in the string - " + word);

		sc.close();
	}

}
