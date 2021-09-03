package com.bridgelabz.datastructureprograms;

import java.util.Arrays;

import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.Stack;

public class AnagramsInStack {

	public static boolean isAnagram(String firstString, String secondString) {

		boolean isAnagram = true;
		char firstArray[] = firstString.toLowerCase().toCharArray();
		char secondArray[] = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		if (firstArray.length != secondArray.length) {
			return false;
		} else {
			for (int arrayIndex = 0; arrayIndex < firstArray.length; arrayIndex++) {
				if (firstArray[arrayIndex] == secondArray[arrayIndex]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

			}
		}
		return isAnagram;
	}

	public static String[][] primeAnagramInRange() {

		PrimeNumbersIn2DArray classObject = new PrimeNumbersIn2DArray();
		int primeArray[][] = new int[10][100];
		int resultIndex = 0;
		String primeAnagram[][] = new String[10][100];
		primeArray = classObject.findPrimesInRange(primeArray);

		for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
			for (int columnIndex = 0; columnIndex < 99 && primeArray[rowIndex][columnIndex] != 0; columnIndex++) {

				for (int index = columnIndex + 1; index < 100 && primeArray[rowIndex][index] != 0; index++) {

					if (isAnagram(String.valueOf(primeArray[rowIndex][columnIndex]),
							String.valueOf(primeArray[rowIndex][index]))) {

						primeAnagram[rowIndex][resultIndex] = String.valueOf(primeArray[rowIndex][columnIndex]);
						resultIndex++;

						primeAnagram[rowIndex][resultIndex] = String.valueOf(primeArray[rowIndex][index]);
						resultIndex++;
					}
				}

			}
			resultIndex = 0;
		}

		return primeAnagram;
	}

	public static void main(String[] args) {

		Stack<String> anagram = new Stack<String>();
		String primeAnagramArray[][] = primeAnagramInRange();
		for (int i = 0; i < primeAnagramArray.length; i++) {
			for (int j = 0; j < primeAnagramArray[i].length; j++) {
				if (primeAnagramArray[i][j] != null) {
					MyNode<String> primeAnagram = new MyNode<String>(primeAnagramArray[i][j]);
					anagram.push(primeAnagram);
				}
			}
		}
		while (!anagram.isEmpty()) {
			System.out.println(anagram.pop().getKey());
		}
	}

}
