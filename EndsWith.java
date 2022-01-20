package com.in28minutes.JspidersQuestion;

import java.util.Scanner;

public class EndsWith {

	public void endWith() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the number ");
		int number = scan.nextInt();
		if (number % 10 == 7) {
			System.out.println("The number ends with 7");
		} else {
			System.out.println("The number doesnt end with 7");
		}
	}

	public void isLeapYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the year ");
		int year = scan.nextInt();
		if ((year % 4 == 0 || year % 100 == 0) && year % 400 == 0) {
			System.out.println("The year is a leap year");
		} else {
			System.out.println("The year is not a leap year");
		}
	}

	public void isPositive() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give the number ");
		int number = scan.nextInt();
		if (number < 0) {
			System.out.println("The number " + number + " is negative.");
		} else if (number > 0) {
			System.out.println("The number " + number + " is positive.");
		} else {
			System.out.println("The number " + number + " is zero.");
		}

	}

	public void isBigger() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give the two numbers ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		if (number1 != number2) {
		int bigger = number1 > number2 ? number1 : number2;
		System.out.println("The number " + bigger + " is bigger.");
	}

		if (number1 == number2) {
			System.out.println("The are equal.");
		}

	}

	public void isBiggest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give the three numbers ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if (number1 != number2) {
		int biggest = number1 > (number2 > number3 ? number2 : number3) ? number1
				: (number2 > number3 ? number2 : number3);
		System.out.println("The number " + biggest + " is bigger.");
	}

		if (number1 == number2 && number1 == number3) {
			System.out.println("The are equal.");
		}

	}

	public void quadEquationRoot() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give the three coefficients ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		double d = Math.sqrt((b * b) - 4 * a * c);
		if (d > 0) {
		double root1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
		double root2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
		System.out.println("The roots are real.");
		System.out.println("The first root is " + root1);
		System.out.println("The second root is " + root2);

		}
	else if (d == 0) {
		double root = -b / (2 * a);
		System.out.println("The roots are real");
		System.out.println("The root is " + root);
	} else {
		System.out.println("The roots are imaginary.");
	}

}
}
