package com.gmail.tiutiuniryna;

public class Main {

	public static void main(String[] args) {
		double oneLiterOfFuel= 1.2;
		double consumptionPerHundredKilometers = 8;
		double distanceToCity = 120;
		double numberOfKilometersPerLiter = 100 / consumptionPerHundredKilometers;
		double numberOfLitersPerCityDistance = distanceToCity / numberOfKilometersPerLiter;
		double theCostOfTravel = numberOfLitersPerCityDistance * oneLiterOfFuel;
		System.out.println("Один литр топлива стоит " + oneLiterOfFuel + " $");
		System.out.println("Наш автомобиль тратит на 100 км пути " + consumptionPerHundredKilometers + " литров топлива");
		System.out.println("Мы едем в соседний город и расстояние нам нужно проехать " + distanceToCity + " км");
		System.out.println("Решение: ");
		System.out.println("1-узнаём сколько км мы проезжаем за 1 литр топлива: 100 делим на 8 = " + numberOfKilometersPerLiter + " км");
		System.out.println("2-узнаём сколько литров топлива мы потратим на 120 км: 120 делим на " + numberOfKilometersPerLiter + " = " + numberOfLitersPerCityDistance + " литров");
		System.out.println("3-узнаём сумму которую заплатим за поезжку: количество литров " + numberOfLitersPerCityDistance + " умножаем на цену топлива " + oneLiterOfFuel + " = " + theCostOfTravel + " $");
		System.out.println("Поездка нам будет стоить " + theCostOfTravel + " $");

	}

}
