package com.bridgelabz.datastructureprograms;

import java.util.Scanner; 
import com.bridgelabz.mydatastructure.LinkedList;
import com.bridgelabz.mydatastructure.MyNode;

public class UnorderedListSearch {

	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		LinkedList<String> wordLinkedList = new LinkedList<String>();
		
		System.out.println("Enter a sentence : ");
		String sentence = scannerObject.nextLine();
				
		String[] sentenceArray = sentence.split(" ");
		
		for(int index = 0; index<sentenceArray.length ; index++) {
			MyNode<String> word = new MyNode<String>(sentenceArray[index]);
			wordLinkedList.add(word);
		}
		wordLinkedList.printLinkedList();
		
		System.out.println("Enter the Word to be searched : ");
		String wordToBeSearched = scannerObject.next();
		
		if(wordLinkedList.search(wordToBeSearched) == null) {
			System.out.println(wordToBeSearched+" Not Present!");
			MyNode<String> wordToBeAdded = new MyNode<String>(wordToBeSearched);
			wordLinkedList.add(wordToBeAdded);
			System.out.println("Word Has Been Added !");
			wordLinkedList.printLinkedList();
		}
		else {
			System.out.println(wordToBeSearched+" is Present!");
			wordLinkedList.deleteNodeWithKey(wordToBeSearched);
			System.out.println("Word Has Been Removed !");
			wordLinkedList.printLinkedList();
		}
		
		scannerObject.close();
	}

}
