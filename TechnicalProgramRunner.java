package com.in28minutes.JspidersQuestion;

public class TechnicalProgramRunner {

	public static void main(String[] args) {
		TechnicalProgram tech = new TechnicalProgram(88, "Neetu is so Beautiful", 12);

		System.out.println(tech.findRemainderWithoutUsingMod());

		System.out.println(tech.findMultiplicationWithoutMultiply());

		System.out.println(tech.findDuplicateChars());
	}

}
