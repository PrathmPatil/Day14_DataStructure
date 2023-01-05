package com.datastructure;

public class LinkList {
	Node head;

	// Creating linkedList and adding data
	public void add(int data){
	Node node = new Node();
	node.data = data;
	node.next = null;

	if (head == null){
	head = node;
	}else {
	Node currNode = head;
	while (currNode.next != null){
	currNode = currNode.next;
	}
	currNode.next = node;
	}
	}
	/*
	To add data to first node
	*/
	public void addFirst(int data){
	Node node = new Node();
	node.data = data;
	node.next = null;
	node.next = head;
	head = node;
	}
/*
 * Print data
 */
	public void display(){
	Node node = head;
	while (node.next != null ){
	System.out.print(node.data+" -> ");
	node = node.next;
	}
	System.out.println(node.data);
	}
	}


