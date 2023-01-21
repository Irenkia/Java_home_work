package com.gmail.tiutiuniryna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number from 1 to 180 inclusive : ");
	    int flat = sc.nextInt();
	    int entrance = (flat - 1) / 36 + 1;
	    int floor = (flat - 36 * (entrance - 1) - 1) / 4 + 1;
	    if(flat >= 1 && flat <= 180) {
	    	System.out.println("Entrance № " + entrance + " floor - " + floor);
	    }else {
	    	System.out.println("This flat does not exist.");
	    }

		sc.close();

	}

}

