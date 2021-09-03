package com.bridgelabz.datastructureprograms;

import java.util.Scanner;
import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.OrderedList;

public class OrderedListSearch {

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		OrderedList<Integer> numberLinkedList = new OrderedList<Integer>();

		System.out.println("Enter the length of list : ");
		int size = scannerObject.nextInt();

		System.out.println("Enter the numbers : ");
		for (int index = 0; index < size; index++) {
			MyNode<Integer> number = new MyNode<Integer>(scannerObject.nextInt());
			numberLinkedList.add(number);
		}
		numberLinkedList.printSortedLinkedList();

		System.out.println("Enter the Number to be searched : ");
		Integer numberToBeSearched = scannerObject.nextInt();

		if (numberLinkedList.search(numberToBeSearched) == false) {
			System.out.println(numberToBeSearched + " Not Present!");
			MyNode<Integer> numberToBeAdded = new MyNode<Integer>(numberToBeSearched);
			numberLinkedList.add(numberToBeAdded);
			System.out.println("Word Has Been Added !");
			numberLinkedList.printSortedLinkedList();
		} else {
			System.out.println(numberToBeSearched + " is Present!");
			numberLinkedList.remove(numberToBeSearched);
			System.out.println("Word Has Been Removed !");
			numberLinkedList.printSortedLinkedList();
		}

		scannerObject.close();
	}

}
