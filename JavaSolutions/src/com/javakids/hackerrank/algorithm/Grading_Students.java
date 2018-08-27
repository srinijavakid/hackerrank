package com.javakids.hackerrank.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author srini
 * 
 *         Problem: https://www.hackerrank.com/challenges/grading/problem
 *
 */
public class Grading_Students {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {

		int[] resultArray = Arrays.stream(grades).boxed().filter(x -> (x <= 100) && (x >= 0)).mapToInt(i -> {
			if (i <= 100 && i >= 0) {
				int mod = i % 5;
				if (mod >= 3 && i >= 38) {
					i = i + (5 - mod);
				}

			}
			return i;
		}).toArray();

		Arrays.stream(resultArray).forEach(num -> System.out.println(num));

		return resultArray;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] grades = new int[n];

		for (int gradesItr = 0; gradesItr < n; gradesItr++) {
			int gradesItem = Integer.parseInt(scan.nextLine().trim());
			grades[gradesItr] = gradesItem;
		}

		int[] result = gradingStudents(grades);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write("\n");
			}
		}

		bw.newLine();

		bw.close();
	}
}
