package com.datastructure;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		
		ll.addData(56);
	    ll.addData(30);
		ll.addData(70);  
		System.out.println("Original list: ");  
        ll.display(); 
        /*
         * call to sort method for sorting
         */
        ll.sortList();  
        System.out.println("Sorted list: ");  
        ll.display();  
	}

}
