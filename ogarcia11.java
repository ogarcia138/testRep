//Author: Omar Garcia
//Date: 11/09/2023
//Purpose: Lab 11 Java Program for GitHub Repository
import java.util.Scanner;
import java.lang.Math;

public class ogarcia11{
	public static void main(String[] args){
		//call method for user input then pass it through
		double squared = square(userInput());
		displayResults(squared);

	}//end main()
	//userInput method
	public static double userInput(){
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter a number to square: ");
		double num = scnr.nextDouble();
		return num;
	}//end userInput()
	//square method
	public static double square(double  num){
		double squared = Math.pow(num,2);
		return squared;
	}//end square()
	//display results
	public static void displayResults(double squared){
		System.out.print("Your number squared is : " + squared);
		System.out.print("\nNothing beats a failure but a try.\n");
	}
}
