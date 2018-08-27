package com.javakids.hackerrank.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author srini
 * 
 * 
 *         Problem:
 *         https://www.hackerrank.com/challenges/diagonal-difference/problem
 *
 */
public class Diagonal_Difference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {

		int length = arr.length - 1;
		int rightdiagonal = 0;
		int leftdiagonal = 0;
		for (int i = 0; i <= length; i++) {

			rightdiagonal = rightdiagonal + arr[i][i];
			leftdiagonal = leftdiagonal + arr[i][length - i];

		}

		return java.lang.Math.abs(rightdiagonal - leftdiagonal);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Enter numbers: ");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		System.out.println(String.valueOf(result));

		scanner.close();
	}
}
