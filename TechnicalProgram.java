package com.in28minutes.JspidersQuestion;

import java.util.LinkedList;

public class TechnicalProgram {
	int number;
	String str;
	int number2;

	TechnicalProgram() {
	}

	TechnicalProgram(int number) {
		this.number = number;
	}

	TechnicalProgram(int number, String str) {
		this(number);
		this.str = str;
	}

	TechnicalProgram(int number, String str, int number2) {
		this(number, str);
		this.number2 = number2;
	}

	public int findRemainderWithoutUsingMod() {
		int remainder = number - ((number / number2) * number2);
		return remainder;
	}

	public int findSumWithoutUsingPlus() {
		int sum = 0;
		return sum;
	}

	public int findSubWithoutMinus() {
		int sub = 0;
		return sub;
	}

	public boolean checkLeapYear(int year) {
		if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public int findMultiplicationWithoutMultiply() {
		int multi = 0;
		for (int i = 1; i <= number2; i++) {
			multi = multi + number;
		}
		return multi;
	}

	public LinkedList<Character> findDuplicateChars() {
		LinkedList<Character> duplicate = new LinkedList<Character>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					if (count > 1) {
						duplicate.add(str.charAt(i));
						break;
					}
				}
			}
		}
		return duplicate;
	}

	public int findFactorialWithoutLoops() {

		return 0;
	}
}
