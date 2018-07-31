package co.grandcircus.lab11;
import java.util.Scanner;
import java.util.ArrayList;
public class TheCarLott {

	protected String make;
	protected String model;
	protected int year;
	protected double price;
	int searchNum;
	String userCar;

	public TheCarLott(String make, String model, int year, double price) {
		Scanner scnr = new Scanner(System.in);
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
		
		
		System.out.println("Welcome to Dandy Randy's car lot!");
		System.out.println("\nHow many cars would you like to search? To search; enter a number between (1=9: ");
		searchNum = scnr.nextInt();
		
		System.out.println("Please enter the make: ");
		userCar = scnr.nextLine();
	
		System.out.println("Please enter the model: ");
		userCar = scnr.nextLine();
		
		System.out.println("Please enter the year: ");
		userCar = scnr.nextLine();
		
		System.out.println("Please enter the price: ");
		userCar = scnr.nextLine();
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
