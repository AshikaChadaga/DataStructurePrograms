package com.bridgelabz.datastructureprograms;

import java.util.Scanner;
import com.bridgelabz.mydatastructure.Dequeue;

public class PalindromeChecker {

	public boolean checkIfPalindrome(String word) {

		Dequeue<Character> dequeueList = new Dequeue<Character>();

		boolean isPalindrome = false;
		Character firstCharacter;
		Character lastCharacter;
		char[] wordArray = word.toCharArray();

		for (int index = 0; index < wordArray.length; index++) {
			dequeueList.addToRear(wordArray[index]);
		}

		while (dequeueList.size() > 1) {
			firstCharacter = dequeueList.removeFromFront();
			lastCharacter = dequeueList.removeFromRear();

			if (firstCharacter != lastCharacter) {
				isPalindrome = false;
				break;
			} else
				isPalindrome = true;
		}

		if (isPalindrome == true) {
			return true;

		} else
			return false;

	}

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		PalindromeChecker checkerObject = new PalindromeChecker();

		System.out.println("Enter the String To Check Palindrome:");
		String word = scannerObject.next();
		boolean ispalindrome = checkerObject.checkIfPalindrome(word);

		if (ispalindrome)
			System.out.println(word + " is a Palindrome");
		else
			System.out.println(word + " is not a Palindrome");
		scannerObject.close();
	}

}
