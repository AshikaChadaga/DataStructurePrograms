package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.mydatastructure.LinkedList;
import com.bridgelabz.mydatastructure.MyLinkedHashMap;
import com.bridgelabz.mydatastructure.MyNode; 


public class HashSearch {
	
static Scanner scannerObject = new Scanner(System.in);
	
	public static void findHashNumber(MyLinkedHashMap<Integer, LinkedList<Integer>> hashMap){
	       
        System.out.print("Enter a number to search: ");
        int numberToSearch = scannerObject.nextInt(); 
        MyNode<Integer> numberToAdd = new MyNode<Integer>(numberToSearch);
        
        LinkedList<Integer> list = hashMap.get(numberToSearch % 11);
       
        if(list.search(numberToSearch) != null)
        {    
            System.out.println("File contains number. Removing it.");
            list.deleteNodeWithKey(numberToSearch);
       
        }
        else
        {    
            System.out.println("File does not contain the number. Adding it to the file.");
            list.add(numberToAdd);
           
        }
        System.out.println(hashMap);
        
          
    }
	
	public static void main(String[] args) {
		
		MyLinkedHashMap<Integer, LinkedList<Integer>> hashMap= new MyLinkedHashMap<Integer, LinkedList<Integer>>();
		
		for(int i=0;i<11;i++)
        {
            hashMap.add(i, new LinkedList<Integer>());
        }
		
		Integer[] numbersArray = {77,26,93,17,31,54,44,20,55};
        
        for(Integer eachNumber : numbersArray)
        {
                LinkedList<Integer> linkedList = hashMap.get(eachNumber % 11);
                MyNode<Integer> numberToAdd = new MyNode<Integer>(eachNumber);
                linkedList.append(numberToAdd);
//                linkedList.list();
        }
        
       System.out.println(hashMap);
       findHashNumber(hashMap);
	}
	
}
