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
	to add data to given position
	*/
	public void addAtPosition(int index , int data){
	Node node = new Node();
	node.data = data;
	node.next = null;

	if (index == 0){
	addFirst(data);
	}
	else
	{
	Node currPosition = head;
	for (int i = 0; i < index-1; i++)
	{
	currPosition = currPosition.next;
	}
	node.next = currPosition.next;
	currPosition.next = node;

	}
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


