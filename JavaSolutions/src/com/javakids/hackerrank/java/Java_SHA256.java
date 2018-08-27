package com.javakids.hackerrank.java;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

/**
 * @author srini
 * 
 *         Problem: https://www.hackerrank.com/challenges/sha-256/problem
 *
 */
public class Java_SHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner input = new Scanner(System.in);
		MessageDigest m = MessageDigest.getInstance("SHA-256");
		m.reset();
		m.update(input.nextLine().getBytes());
		for (byte i : m.digest()) {
			System.out.print(String.format("%02x", i));
		}
		System.out.println();
	}
}
