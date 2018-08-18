package com.javakids.hackerrank.solutions;

import java.util.StringTokenizer;

public class Java_String_Tokens {

	public static void main(String[] args) {

		String s = "He is a very very good boy, isn't he?";

	//	String[] array=s.spli      (s, "[\\s*|A-Za-z !,?._'@]+");
		
		
		StringTokenizer splitter = new StringTokenizer(s, "[!,?._'@ ]+");
		System.out.println(splitter.countTokens());

		while (splitter.hasMoreTokens()) {
			System.out.println(splitter.nextToken() + "\t");
		}
		
	}

}
