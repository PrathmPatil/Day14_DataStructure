package com.datastructure;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		
		ll.add(56);
	    ll.add(30);
		ll.add(70);
		ll.display();
		/*
		 * (position, value)
		 */
		int position,value;
		System.out.println("Add at Position: ? "+"Value: ? ");
		Scanner sc= new Scanner(System.in);
		System.out.printf("Add at positon: %d "+"Value: %d",position=sc.nextInt(),value=sc.nextInt());
		System.out.println();;
		ll.addAtPosition(position, value);
//		ll.addFirst(70);
//		ll.addFirst(30);
//		ll.addFirst(56);
		ll.display();
//		ll.deleteFirst();
//		ll.deleteLast();
		ll.display();
		System.out.println(ll.getsize());
	}

}
