package com.gmail.tiutiuniryna;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[5][7];
		cteateArray(arr);
		System.out.println("This is our array");
		printArray(arr);
		System.out.println();

		System.out.println("Saving our array to a text file");
		System.out.println();
		File myFile = new File("myFile.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		saveArrayToFile(arr, myFile);

		String result = loadArrayFromFile(myFile);
		System.out.println("Our array in a text file is written like this");
		System.out.println(result);

	}

	public static void cteateArray(int[][] arr) {
		Random rn = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rn.nextInt(1, 9);
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static void saveArrayToFile(int[][] arr, File f) {
		try (PrintWriter pw = new PrintWriter(f)) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					pw.print(arr[i][j] + " ");
				}
				pw.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String loadArrayFromFile(File f) {
		String result = "";
		try (Scanner sc = new Scanner(f)) {
			for (; sc.hasNextLine();) {
				result += sc.nextLine() + System.lineSeparator();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
