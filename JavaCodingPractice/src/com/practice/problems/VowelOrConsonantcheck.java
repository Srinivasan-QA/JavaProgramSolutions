package com.practice.problems;

import java.util.Scanner;

public class VowelOrConsonantcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		sc.close();
		String output = FindVowel(input);
		System.out.println(output);

	}

	private static String FindVowel(char input) {
		// TODO Auto-generated method stub
		
		String str = "aeiouAEIOU";
		if (str.indexOf(input) != -1)
			return "Vowel";
		else
			return "Consonant";
		
	}

}
