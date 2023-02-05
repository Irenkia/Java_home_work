package com.gmail.tiutiuniryna;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File myFile = new File("myFile.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File workFolder = new File(".");
		File[] files = workFolder.listFiles();
		System.out.println("\"myFile.txt\" is in our project");
		 System.out.println();
		for (int i = 0; i < files.length; i++) {
			String type ="file";
		      if (files[i].isDirectory()) {
		          type = "folder";
		        }
		      System.out.println(files[i] + "\t " + type);
		}

		Scanner sc = new Scanner(System.in);
		 System.out.println();
		System.out.println("Enter string to save to file");
		String text = sc.nextLine();

		saveStringToFile(text, myFile);

		String result = loadStringFromFile(myFile);
		 System.out.println();
		System.out.println("Your string in the file");
		System.out.println(result);

		sc.close();

	}

	public static void saveStringToFile(String str, File f) {
		try (PrintWriter pw = new PrintWriter(f)) {
			pw.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String loadStringFromFile(File f) {
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
