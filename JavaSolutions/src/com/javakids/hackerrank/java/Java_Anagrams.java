package com.javakids.hackerrank.java;

/**
 * @author srini
 * 
 *         Problem:https://www.hackerrank.com/challenges/java-anagrams/problem
 *         *
 */
public class Java_Anagrams {

	public static void main(String args[]) {

	}

	static boolean isAnagram(String a, String b) {

		int alength = a.length();
		int blength = b.length();

		if (alength >= 1 && alength <= 100 && blength >= 1 && blength <= 100) {

			if (a.length() != b.length()) {
				return false;
			}

			char[] aArray = a.toLowerCase().toCharArray();
			char[] bArray = b.toLowerCase().toCharArray();

			java.util.Arrays.sort(aArray);
			java.util.Arrays.sort(bArray);

			return java.util.Arrays.equals(aArray, bArray);
		}
		return true;
	}
}
