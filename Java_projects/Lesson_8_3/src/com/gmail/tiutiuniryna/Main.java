package com.gmail.tiutiuniryna;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		System.out.println("Project folder");
		File workFolder = new File(".");
		String strWorkFolder = workFolder.getPath();
		listOfAllDirectories(strWorkFolder);
		System.out.println();

		System.out.println("Folder \"src\" in the project");
		File srcFolder = new File(workFolder, "src");
		String strSrcFolder = srcFolder.getPath();
		listOfAllDirectories(strSrcFolder);
		System.out.println();

		System.out.println("Folder \"bin\" in the project");
		File binFolder = new File(workFolder, "bin");
		String strBinFolder = binFolder.getPath();
		listOfAllDirectories(strBinFolder);
		System.out.println();

	}

	public static void listOfAllDirectories(String stringPath) {
		File folder = new File(stringPath);
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) {
			String type = "Folder";
			if (files[i].isDirectory()) {
				System.out.println(files[i] + "\t\t" + type);
			}
		}

	}

}
