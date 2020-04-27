package talkingbeltgames.com.scratchpad;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// Dynamic Array
		// Completed: 4/15/2020

// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-		
		
		// Print Linked list
		// Competed: 4/18/2020
		/*
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(13);
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(16);
		node1.next = node2;
		printLinkedList(node1);
		*/

// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-		
		
		// Insert a node at a specific position in a linked list
		// Completed: 4/22/2020
		/*
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(7);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(13);
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(16);
		node1.next = node2;
		node2.next = node3;
		printLinkedList(node1);
		System.out.println("============================");
		SinglyLinkedListNode result = insertNodeAtPosition(node1, 1, 2);
		printLinkedList(result);
		*/
		
// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-		

		// Delete a Node
		// Completed: 2/24/2020
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(20);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(6);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(19);
		SinglyLinkedListNode node5 = new SinglyLinkedListNode(7);
		SinglyLinkedListNode node6 = new SinglyLinkedListNode(4);
		SinglyLinkedListNode node7 = new SinglyLinkedListNode(15);
		SinglyLinkedListNode node8 = new SinglyLinkedListNode(9);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		printLinkedList(node1);
		System.out.println("============================");
		SinglyLinkedListNode result = deleteNode(node1, 3);
		printLinkedList(result);

// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-		

	    }


    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
		if (position == 0) {
			return head.next;
		}
		
    	SinglyLinkedListNode lastNode = head;
    	SinglyLinkedListNode currentNode = lastNode.next;
    	int index = 1;
    	
    	while (index <= position) {
    		if (index == position) {
    			lastNode.next = currentNode.next;
    			return head;
    		}
    		
    		lastNode = currentNode;
    		currentNode = currentNode.next;
    		index++;
    	}
    	
    	return head;
    }

    
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer> returnList = new ArrayList<>();
		List<List<Integer>> seqList = new ArrayList<List<Integer>>(n);
		int lastAnswer = 0;

		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<>());
		}

		for (int i = 0; i < queries.size(); i++) {
			int query = queries.get(i).get(0);
			int x = queries.get(i).get(1);
			int y = queries.get(i).get(2);
			int t = (x ^ lastAnswer) % n;
			List<Integer> seq = seqList.get(t);

			switch (query) {
			case 1:
				seq.add(y);
				break;

			case 2:
				lastAnswer = seqList.get(t).get(y % seq.size());
				System.out.println(lastAnswer);
				returnList.add(lastAnswer);
				break;
			}
		}

		return returnList;
	}

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode nextNode = head.next;
        
        while (nextNode != null) {
            System.out.println(head.data);
            head = nextNode;
            nextNode = head.next;
        }
        System.out.println(head.data);
    }	

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        if (position == 0) {
        	newNode.next = head;
        	return newNode;
        }
        
        SinglyLinkedListNode currentNode = head;
        int index = 1;

        while (index < position) {
            currentNode = currentNode.next;
            index++;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
        return head;
    }

}
