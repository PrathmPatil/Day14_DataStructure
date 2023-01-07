package com.datastructure;

public class LinkList {
	Node head;
  private int size;
    
	public LinkList() {
	
	this.size = 0;
}
	// Creating linkedList and adding data
	public void add(int data){
	Node node = new Node();
	node.data = data;
	node.next = null;
     size++;
	if (head == null)
	{
	head = node;
	}
	else 
	{
	Node currNode = head;
	while (currNode.next != null)
	{
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
	size++;
	head = node;
	}
	/*
	to add data to given position
	*/
	public void addAtPosition(int index , int data){
	Node node = new Node();
	node.data = data;
	node.next = null;
     size++;
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
	 * Delete first element
	 */
	public void deleteFirst()
	{
		if(head==null)
		{
			return;
		}
		head=head.next;
		size--;
	}
	/*
	 * Delete last element
	 */
	public void deleteLast()
	{
		if(head==null)
		{
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
	Node secondLast=head;
	Node lastNode=head.next;
	size--;
	 while(lastNode.next!=null)
	 {
		 lastNode=lastNode.next;
		 secondLast=secondLast.next;
	 }
	 secondLast.next=null; 
	}
	public  int getsize()
	{
		return size;
	}
	/*
	 * search linkedlist
	 */
	public void searchDelete(int data)
	{
		Node current=head, previous=null;
		
		if(current!=null&& current.data==data) {
			head=current.next;
			return;
		}
		
			while(current!=null && current.data!=data)
			{
				previous=current;
				current=current.next;
			}
			if(current==null)
			{
				return;
			}
		previous.next=current.next;
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


