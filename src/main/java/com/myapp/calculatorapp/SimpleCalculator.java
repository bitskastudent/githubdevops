package main.java.com.myapp.calculatorapp;

import java.util.Locale;
import java.util.Scanner;
/*Very very simple Java Calculator for beginners just for 4 operations on 
 * two variables without exception and while loop*/

public class SimpleCalculator {
	Scanner scan = new Scanner(System.in);

	public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

	}

	public String division(double a, double b) {
		scan.useLocale(Locale.US); // set to this have "." instead of "," it depends on your region
		if (b == 0)
			return "Division by zero not possible";

		double val = a / b;
		return String.valueOf(val);
	}

	public double multiplication(double a, double b) {
		scan.useLocale(Locale.US);
		double val = a * b;
		return val;
	}


	public double subtraction(double a, double b) {
		scan.useLocale(Locale.US);
		// double a, b;
		// System.out.println("Enter first value");
		// a = scan.nextDouble();
		// System.out.println("Enter second value");
		// b = scan.nextDouble();
		double val = a - b;

		return val;
	}

	public double addition(double a, double b) {
		scan.useLocale(Locale.US);
		// double a, b;
		// System.out.println("Enter first value");
		// a = scan.nextDouble();
		// System.out.println("Enter second value");
		// b = scan.nextDouble();
		double val = a + b;

		return val;
	}

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int x;
		double score, a, b;
		calc.showMenu();
		x = scan.nextInt();
		System.out.println("Enter first value");
		a = scan.nextDouble();
		System.out.println("Enter second value");
		b = scan.nextDouble();
		switch (x) {
			case 1:
				score = calc.addition(a, b);
				System.out.println(score);
				break;
			case 2:
				score = calc.subtraction(a, b);
				System.out.println(score);
				break;
			case 3:
				score = calc.multiplication(a, b);
				System.out.println(score);
				break;
			case 4:
				String msg;
				msg = calc.division(a, b);
				System.out.println(msg);
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
		scan.close();
	}

}
