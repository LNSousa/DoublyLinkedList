package com.lsousa.dll;

public class DoublyLinkedList {
	public Node head;
	public Node tail;
    public DoublyLinkedList() {
        this.head = null;
    }
    
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } 
        Node lastNode = tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        tail = newNode;
        head.previous = null;
    }
    
    public void printValuesForward() {
    	Node runner = this.head;
    	
    	while(runner != null) {
    		System.out.println(runner.value);
    		runner = runner.next;
    	}
    }
    
    public void printValuesBackwards() {
    	Node runner = this.tail;
    	
    	while (runner != null) {
    		System.out.println(runner.value);
    		runner = runner.previous;
    	}
    }
    
    public Node pop() {
    	Node previousTail = this.tail;
    	
    	this.tail.previous.next = null;
    	this.tail = this.tail.previous;
    	
    	return previousTail;
    	
    }
    
    public boolean contains(Integer value) {
    	Node runner = this.head;
    	
    	while(runner != null) {
    		if(runner.value == value) {
    			return true;
    		}
    		runner = runner.next;
    	}
    	return false;
    }
    
    public int size() {
    	int counter = 0;
    	Node runner = this.head;
    	
    	while(runner != null) {
    		counter++;
    		runner = runner.next;
    	}
    	
    	return counter;
    }
    
    public void insertAt(Node newNode, int index) {
    	
    	if(index >= this.size()) {
    		newNode.previous = this.tail;
    		this.tail.next = newNode;
    		this.tail = newNode;
    		return;
    	}
    	
    	if(index <= 0) {
    		newNode.next = this.head;
    		this.head.previous = newNode;
    		this.head = newNode;
    		return;
    	}
    	
    	Node runner = this.head;
    	for(int i = 0; i < index-1; i++) {
    		runner = runner.next;
    	}
    	
    	newNode.next = runner.next;
    	runner.next.previous = newNode;
    	runner.next = newNode;
    	newNode.previous = runner;
    }
    
    public void removeAt(int index) {
    	if(index >= this.size()) {
    		return;
    	}
    	
    	if(index < 0) {
    		return;
    	}
    	
    	if(index == 0) {
    		this.head = this.head.next;
    		this.head.previous = null;
    		return;
    	}
    	
    	Node runner = this.head;
    	int counter = 0;
    	while(runner.next.next != null && counter != index) {
    		runner = runner.next;
    		counter++;
    	}
    	
    	if (runner.next.next != null) {
    		runner.next = runner.next.next;
    		runner.next.next.previous = runner;
    		return;
    	} else {
    		this.pop();
    	}
    }
    
    public boolean isPalindrome() {
    	Node headRunner = this.head;
    	Node tailRunner = this.tail;
    	
    	while(headRunner.next != null) {
    		if (headRunner.value != tailRunner.value) {
    			return false;
    		}
    		headRunner = headRunner.next;
    		tailRunner = tailRunner.previous;
    	}
    	return true;
    }
}

















