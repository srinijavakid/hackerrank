package com.javakids.hackerrank.solutions;

public class Java_Regex {

//	public final static String pattern = "(d 25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
	
	static String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public static String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

	public static void main(String[] args) {

		String IP = "123.231.36.32";
		System.out.println(IP.matches(pattern));
		

	}
}
