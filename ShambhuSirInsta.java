package com.in28minutes.JspidersQuestion;

import java.util.Scanner;

public class ShambhuSirInsta {

	public int midValueOfTwoNumbers(int number1, int number2) {
		while (number1 < --number2) {
			++number1;
		}
		return number1;
	}

	public int findSumOfNext10Numbers(int number) {
		int sum = 0;
		int i = number;
		while (i <= (number + 9)) {
			sum = sum + i;
			i++;
		}
		return sum;
	}

	public void reverseANumber(int number) {
		int count = 0;
		while (number > 0) {
			count = number % 10;
			number = number / 10;
			System.out.print(count);
			}
		}

		public int xPowerOfNumber(int x, int number) {
		int product = 1;
		for (int i = 1; i <= x; i++) {
			product = product * number;
		}
		return product;
	}

	public int findFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public int sumUpTo(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public void swapVariables(int num1, int num2) {
		System.out.println("Before swapping the values, the variables are num1 = " + num1 + " & num2 = " + num2);
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println("After swapping the values, the variables are num1 = " + num1 + " & num2 = " + num2);

	}

	public int divisibleBy13(int m, int n) {
		int count = 0;
		for (int i = m; i <= n; i++) {
			if (i % 13 == 0) {
				count++;
			}
		}
		return count;
	}

	public boolean isPalindromOrNot(int number) {
		int count = 0;
		int palindrom = number;
		while (number > 0) {
			count = (count * 10) + number % 10;
			;
			number = number / 10;
	}
	if (palindrom == count) {
			System.out.println("The number is a palindrom number.");
			return true;
		}
		else {
		System.out.println("This number is not a palindrom number.");
		return false;
	}

}

public int findTheDigitsInANumber(int number) {
	int count = 0;
	while (number > 0) {
		number = number / 10;
		count++;
	}
	return count;
}

public boolean checkLeapYear(int year) {
	if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
		System.out.println("The year is a Leap year.");
		return true;
	} else {
		System.out.println("The year is not a leap year.");
		return false;
	}
	}

public boolean isAlphabetOrNot(char ch) {

	if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 120)) {
		System.out.println("The given character is an Alphabet");
		return true;
	} else {
		System.out.println("The given character is not an Alphabet");
	}
	return false;
}

public void printTable(int table) {
	for (int i = 1; i <= 10; i++) {
		System.out.printf("%d * %d = %d", table, i, table * i).println();
	}
}

public void displayFibonacciSeries() {
	int sum = 1;
	int fibo = 0;
	System.out.print("0 1 ");
	for (int i = 1; i <= 10; i++) {
		sum = sum + fibo;
		fibo = sum - fibo;
		System.out.print(sum + " ");
	}
	System.out.println();
}

public int getGCD(int value1, int value2) {
	int result = 0;
	int bigger = (value1 >= value2 ? value1 : value2);
	int smaller = (value1 <= value2 ? value1 : value2);
	for (int i = 1; i <= bigger; i++) {
		if (bigger % i == 0 && smaller % i == 0) {
				result = i;
		}
	}
	return result;
}

public int getLCM(int value1, int value2) {
	int lcm = 0;
	int bigger = (value1 > value2 ? value1 : value2);
	int smaller = (value1 < value2 ? value1 : value2);
	for (int i = bigger; i <= Integer.MAX_VALUE; i += bigger) {
		if (i % smaller == 0) {
			lcm = i;
			break;
			}
		}
		return lcm;
	}

public void displayAlphabets() {
	for (char ch1 = 65, ch2 = 97; ch1 <= 90; ch1++, ch2++) {
		System.out.print(ch1 + " ");
		System.out.println(ch2 + " ");
	}
}

public boolean isPrime(int number1) {
	for (int i = 2; i <= number1 - 1; i++) {
		if (number1 % i == 0) {
			System.out.println("The number is not prime.");
			return false;
		}
	}
	System.out.println("The number is prime.");
	return true;
}

public void displayPrimeNumbers(int number1, int number2) {
	int bigger = number1 > number2 ? number1 : number2;
	int smaller = number1 < number2 ? number1 : number2;
	System.out.println("The prime numbers are ");
	for (int i = smaller; i <= bigger; i++) {
		for (int j = 2; j <= i - 1; j++) {
			if (i % j == 0) {
				break;
			} else if (j == i - 1) {
				System.out.print(i + " ");
			}
		}
		}
	}

	public boolean checkArmstrongNumber(int number) {
		int check = number;
		int digit = 0;
		double sum = 0.0;
		int power = 0;
		while (check >= 1) {
			check = check / 10;
			power++;
		}
		check = number;
		for (int i = 1; i <= power; i++) {
			digit = check % 10;
			check = check / 10;
			sum = sum + Math.pow(digit, power);
		}
		if (sum == number) {
			System.out.println("The number is an Armstrong Number.");
			return true;
		}
		System.out.println("The number is not an Armstrong Number");
		return false;
}

public void displayArmstrongNumberBetweenTwoIntervals(int number1, int number2) {
	System.out.print("The Armstrong Numbers between the intervals are ");
	for (int i = number1; i <= number2; i++) {
		int digit = 0;
		double sum = 0.0;
		int power = 0;
		int check = i;
		while (check >= 1) {
			check = check / 10;
			power++;
		}
		check = i;
		for (int j = 1; j <= power; j++) {
			digit = check % 10;
			check = check / 10;
			sum = sum + Math.pow(digit, power);
		}
		if (sum == i) {
			System.out.print(i + " ");
		}
	}
}
public void displayFactorsOfANumber(int number) {
	System.out.print("The factors of the number are ");
	for (int i = 1; i <= number; i++) {
		if (number % i == 0) {
			System.out.print(i + " ");
		}
	}
}

public void displayAlternatePrimeNumbers(int number1, int number2) {
	System.out.print("The alternate prime numbers are ");
	int check = 0;
	for (int i = number1; i <= number2; i++) {
		int count = 0;
		for (int j = 2; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 1) {
			check++;
			if (check % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}
}

public void findFactorialOfEveryIndividualDigit() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number ");
	int number = scan.nextInt();
	int digit = 0;
	int check = number;
	while (check >= 1) {
		int factorial = 1;
		digit = check % 10;
		check = check / 10;
		if (digit == 0) {
			System.out.print("The factorials of digit 0 is 1");
		}
		else {
			System.out.print("The factorials of digit " + digit + " is ");
		for (int j = 1; j <= digit; j++) {
			factorial = factorial * j;
			}
		}
		System.out.println(factorial + " ");
	}
	}


	public int findSumOfFactorialOfEveryIndividualDigit(int number) {
	int digit = 0;
	int check = number;
	int sum = 0;
	while (check >= 1) {
		int factorial = 1;
		digit = check % 10;
		check = check / 10;
		for (int j = 1; j <= digit; j++) {
			factorial = factorial * j;
		}
		sum = sum + factorial;
	}
	System.out.print("The sum of factorials of all the digits is ");
	System.out.print(sum + " ");
	System.out.println();
	return sum;
}

public boolean isPetersonNumber(int number) {
	int check = findSumOfFactorialOfEveryIndividualDigit(number);
	if (check == number) {
		System.out.println("The number is an peterson number");
		return true;
	}
	System.out.println("The number is not a peterson number");
	return false;
}

public boolean isSunnyNumber(int number) {
	int i = 0;
	while (i <= number) {
		if (i * i == number + 1) {
			System.out.println("The number is a sunny number.");
			return true;
		}
		i++;
	}
	System.out.println("The number is not a sunny number.");
	return false;
}

public boolean isTechNumber(int number) {
	int count = 0;
	int check = number;
	int half1 = 0;
	int half2 = 0;
	while (check >= 1) {
		check = check / 10;
		count++;
	}
	check = number;
	if (count % 2 == 1) {
		System.out.println("The number is not a Tech number.");
		return false;
	}
	half1 = check % (int) Math.pow(10, count / 2);
	half2 = check / (int) Math.pow(10, count / 2);
		if ((half1 + half2) * (half1 + half2) == number) {
			System.out.println("The number is a Tech number.");
			return true;
		}
		System.out.println("The number is not a Tech number.");
	return false;
}

public boolean findFascinatingNumber(int number) {
	int check = number;
	int number1 = check * 2;
	int number2 = check * 3;
	int count = 0;
	while (check > 10) {
		check = check / 10;
		count++;
	}
	int total = check + number1 * (int) Math.pow(10, 3) + number2 * (int) Math.pow(10, 6);
	for (int i = 1; i <= count; i++) {
		int digit = total % 10;
		if (digit >= 1 && digit <= 9) {

		}
	}
	return false;
}

public boolean findKeithNumber(int number) {
	int check = number;
	int digit = 0;
	int sum = 0;
	int count = 0;
	while (sum <= number) {
		int keith = 0;
		while (check >= 1) {
			count++;
			digit = check % 10;
			sum = sum + digit;
			check = check / 10;
		}
		check = (check * (int) Math.pow(10, count) % (int) Math.pow(10, count - 1));
		digit = check % 10;
		sum = sum + keith;
	}
	return false;
}

public boolean findNeonNumber(int number) {
	int check = number * number;
	int digit = 0;
	int sum = 0;
	while (check >= 1) {
		digit = check % 10;
		sum = sum + digit;
		check = check / 10;
	}
	if (sum == number) {
		System.out.println("The number is a Neon number");
		return true;
	}
	System.out.println("The number is not a neon number");
	return false;
}

public boolean findSpyNumber(int number) {
	int digit = 0;
	int sum = 0;
	int product = 1;
	while (number >= 1) {
		digit = number % 10;
		sum = sum + digit;
		product = product * digit;
		number = number / 10;
	}
	if (sum == product) {
		System.out.println("The number is a Spy number.");
		return true;
	}
	System.out.println("The number is not a Spy number");
	return false;
}
}
