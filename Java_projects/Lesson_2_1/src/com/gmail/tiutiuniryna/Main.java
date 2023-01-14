package com.gmail.tiutiuniryna;

public class Main {

	public static void main(String[] args) {
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double perimeter = 0.5 * (sideA + sideB + sideC);
		double square = perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC);
		System.out.println( Math.sqrt(square));

	}

}
