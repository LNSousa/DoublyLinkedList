package com.lsousa.dll;

public class ListTester {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(3);
        dll.add(4);
        dll.add(10);
        dll.add(4);
        dll.add(4);
        dll.add(3);

//        dll.add(5);
//        dll.add(15);
//        dll.add(2);
        
//        dll.printValuesForward();
//        System.out.println("==================");
//        dll.printValuesBackwards();
//        System.out.println("==================");
//        System.out.println(dll.pop().value);
//        System.out.println("==================");
//        dll.printValuesForward();
//        System.out.println("==================");
//        System.out.println(dll.contains(15));
//        System.out.println("==================");
//        System.out.println(dll.size());
//
//        System.out.println("==================");
//        Node newNode = new Node(52);
//        dll.insertAt(newNode, 0);
//        dll.printValuesForward();
//        System.out.println("==================");
//        dll.printValuesBackwards();
        
//        dll.removeAt(5);
//        dll.printValuesForward();
//        System.out.println("==================");
//        dll.printValuesBackwards();
        
        System.out.println(dll.isPalindrome());
	}

}
