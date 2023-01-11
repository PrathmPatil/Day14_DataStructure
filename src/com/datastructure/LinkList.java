package com.datastructure;

public class LinkList {
	Node head, next = null;  
	//add data() 
    public void addData(int data) 
    {  
        
        Node node = new Node(data);  
        //If list is empty  
        if(head == null)
        {  
           
            head = next = node;  
           
            next.next = null;  
        }  
        //asign the value to next
        else
        {  
             next.next = node;  
            node.previous = next;  
            next = node;  
            next.next = null;  
        }  
    }
    public void sortList() {  
        Node current = null, index = null;  
        int temp;  
        
        if(head == null) {  
            return;  
        }  
        else {  
             
            for(current = head; current.next != null; current = current.next) {  
                
                for(index = current.next; index != null; index = index.next) {  
                    
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        }  
    }  
    public void display() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }
	public void add(int data) {
		// TODO Auto-generated method stub
		
	}  
}


