package co.grandcircus.lab11;

import java.util.Scanner;
import java.util.ArrayList;

public class CarLotApp {
	/*
	 * Author: Anesha Robinson-Jenkins 
	 * 
	 * This application will allow the user to view a
	 * pre-selected variety of cars. The user will then be able to select one of the
	 * cars, and view information regarding the vehicle. The user will be prompted
	 * to continue looking at cars, or have the program end.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		int userNum;

		System.out.println("Welcome to Dandy Randy's New and Used car lot!");
		do {//the do while loop will continue to run as long as user continues app
			System.out.println("This is our most current inventory list: \n"); //displays current inventory list
			System.out.println("================================================");
			System.out.println("");
			ArrayList<Car> list = new ArrayList<>();
			list.add(new Car("Lincoln", "MKX", 2018, 55000));
			list.add(new Car("Ford", "Taurus", 2018, 47000));
			list.add(new Car("Tesla", "Model X", 2018, 57000));
			list.add(new Car("Jeep", "Cherokee", 2018, 53000));
			list.add(new Car("Ford", "Escape", 2019, 34000));
			list.add(new UsedCar("Chevy", "Impala", 2017, 10000, 25000));
			list.add(new UsedCar("Dodge", "Ram", 2015, 20000, 38000));
			list.add(new UsedCar("BMW", "750li", 2010, 15000, 104000));
			list.add(new UsedCar("Audi", "A6", 2008, 13000, 158000));

			for (int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + "." + list.get(i));
			}

			System.out.println("\nWhich car would you like to see? Select the number displayed for the car type: ");
			userNum = scnr.nextInt();
			//allows user to select car information to see based upon number entered.
			//number entered pertains to array index - 1. 
			if (userNum == 1) {
				System.out.println(list.get(0));
			} else if (userNum == 2) {
				System.out.println(list.get(1));
			} else if (userNum == 3) {
				System.out.println(list.get(2));
			} else if (userNum == 4) {
				System.out.println(list.get(3));
			} else if (userNum == 5) {
				System.out.println(list.get(4));
			} else if (userNum == 6) {
				System.out.println(list.get(5));
			} else if (userNum == 7) {
				System.out.println(list.get(6));
			} else if (userNum == 8) {
				System.out.println(list.get(7));
			} else if (userNum == 9) {
				System.out.println(list.get(8));
			}
			System.out.println("Do you wish to purchase this car? (y/n): ");
			
			System.out.println("Would you like to select another car? (y/n): ");
			userInput = scnr.next();
		} while (userInput.equalsIgnoreCase("y"));
		//loop exits if user presses any key besides "y"
		System.out.println("Thank you for looking at Dandy Randy's online carlot!");
		scnr.close();
	}
}
