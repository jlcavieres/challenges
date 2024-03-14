package cl.challenges.exercises;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		String s = "abba";

		System.out.println(isPalindrome(s));
	}

	public static int isPalindrome(String s) {
		// code here

		char[] letters = s.toCharArray();		

		char[] backWardletters = new char[letters.length];

		int i = letters.length - 1;
		int j = 0;

		while (j < letters.length) {

			backWardletters[j] = letters[i];

			i--;
			j++;
		}
		
		

		System.out.println(letters);
		System.out.println(backWardletters);

		// 2: Conocer como comparar arreglos		
		return  Arrays.equals(letters, backWardletters) ? 1 : 0;

	}

}
