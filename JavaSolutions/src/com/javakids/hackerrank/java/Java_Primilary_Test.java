package com.javakids.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author srini
 *
 */
public class Java_Primilary_Test {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		BigInteger val = scanner.nextBigInteger();

		int maxBits = BigInteger.TEN.pow(100).bitLength();
		System.out.println(maxBits);
		System.out.println(val.bitLength());
		System.out.println(val.bitCount());
		if (!val.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		scanner.close();
	}
}
