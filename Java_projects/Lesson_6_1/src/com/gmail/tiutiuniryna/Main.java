package com.gmail.tiutiuniryna;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");
		String str = sc.nextLine();
		char [] strArray = str.toCharArray();
		System.out.println(Arrays.toString(strArray));
		char sym = 'b';
		int counter = 0;
		for(int i =0;i<strArray.length;i++) {
			if(sym == strArray[i]) {
				counter ++;
			}
		}
		System.out.println("Character 'b' found in string " + counter + " times");
		sc.close();

	}

}
