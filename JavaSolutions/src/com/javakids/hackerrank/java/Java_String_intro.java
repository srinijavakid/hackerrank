package com.javakids.hackerrank.java;

import java.util.Scanner;

public class Java_String_intro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "zebra";
		String b = "java";
		System.out.println(a.length() + b.length());

		if ((a.compareTo(b)) <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()
				+ b.substring(1));
	}
}
