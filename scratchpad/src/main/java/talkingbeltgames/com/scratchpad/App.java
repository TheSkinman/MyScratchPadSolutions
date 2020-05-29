package talkingbeltgames.com.scratchpad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Dynamic Array
		// Completed: 4/15/2020

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-

		// Print Linked list
		// Competed: 4/18/2020
		/*
		 * SinglyLinkedListNode node2 = new SinglyLinkedListNode(13);
		 * SinglyLinkedListNode node1 = new SinglyLinkedListNode(16); node1.next =
		 * node2; printLinkedList(node1);
		 */

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-

		// Insert a node at a specific position in a linked list
		// Completed: 4/22/2020
		/*
		 * SinglyLinkedListNode node3 = new SinglyLinkedListNode(7);
		 * SinglyLinkedListNode node2 = new SinglyLinkedListNode(13);
		 * SinglyLinkedListNode node1 = new SinglyLinkedListNode(16); node1.next =
		 * node2; node2.next = node3; printLinkedList(node1);
		 * System.out.println("============================"); SinglyLinkedListNode
		 * result = insertNodeAtPosition(node1, 1, 2); printLinkedList(result);
		 */

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-
		/*
		 * // Delete a Node // Completed: 2/24/2020 SinglyLinkedListNode node1 = new
		 * SinglyLinkedListNode(20); SinglyLinkedListNode node2 = new
		 * SinglyLinkedListNode(6); SinglyLinkedListNode node3 = new
		 * SinglyLinkedListNode(2); SinglyLinkedListNode node4 = new
		 * SinglyLinkedListNode(19); SinglyLinkedListNode node5 = new
		 * SinglyLinkedListNode(7); SinglyLinkedListNode node6 = new
		 * SinglyLinkedListNode(4); SinglyLinkedListNode node7 = new
		 * SinglyLinkedListNode(15); SinglyLinkedListNode node8 = new
		 * SinglyLinkedListNode(9); node1.next = node2; node2.next = node3; node3.next =
		 * node4; node4.next = node5; node5.next = node6; node6.next = node7; node7.next
		 * = node8; printLinkedList(node1);
		 * System.out.println("============================"); SinglyLinkedListNode
		 * result = deleteNode(node1, 3); printLinkedList(result);
		 */
		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-

		/*
		 * SinglyLinkedListNode nodeA1 = new SinglyLinkedListNode(1);
		 * SinglyLinkedListNode nodeA2 = new SinglyLinkedListNode(2);
		 * SinglyLinkedListNode nodeB1 = new SinglyLinkedListNode(1);
		 * SinglyLinkedListNode nodeC1 = new SinglyLinkedListNode(1);
		 * SinglyLinkedListNode nodeC2 = new SinglyLinkedListNode(2);
		 * SinglyLinkedListNode nodeD1 = new SinglyLinkedListNode(1);
		 * SinglyLinkedListNode nodeD2 = new SinglyLinkedListNode(2); nodeA1.next =
		 * nodeA2; nodeC1.next = nodeC2; nodeD1.next = nodeD2;
		 * 
		 * System.out.println("============================"); boolean result =
		 * compareLists(nodeA1, nodeB1); System.out.println("The return was: " +
		 * result); System.out.println("============================"); result =
		 * compareLists(nodeC1, nodeD1); System.out.println("The return was: " +
		 * result);
		 */

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-
		/*
		 * SinglyLinkedListNode nodeA1 = new SinglyLinkedListNode(1);
		 * SinglyLinkedListNode nodeA2 = new SinglyLinkedListNode(2);
		 * SinglyLinkedListNode nodeA3 = new SinglyLinkedListNode(3);
		 * SinglyLinkedListNode nodeB1 = new SinglyLinkedListNode(3);
		 * SinglyLinkedListNode nodeB2 = new SinglyLinkedListNode(4); nodeA1.next =
		 * nodeA2; nodeA2.next = nodeA3; nodeB1.next = nodeB2;
		 * printFlatLinkedList(nodeA1); printFlatLinkedList(nodeB1);
		 * System.out.println("============================"); SinglyLinkedListNode
		 * result = mergeLists(nodeA1, nodeB1); printFlatLinkedList(result);
		 */

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-

		// Get position from tail
		// Comnpleted: 5/7/202
		/*
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(3);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(1);
		node1.next = node2;
		node2.next = node3;

		int result = getNode(node1, 0);

		System.out.println("Answer: " + result);
		*/
		

		// -=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=--=#=-

		// Check for cycle.
		// Comnpleted: 5/29/202
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(3);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(1);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;

		boolean result = hasCycle(node1);

		System.out.println("Answer: " + result);
		
		
		
	}

	static boolean hasCycle(SinglyLinkedListNode head) {
		if (head == null) {
			return false;
		}

		Set<SinglyLinkedListNode> nodeSet = new HashSet<>();

		while (head != null) {

			if (nodeSet.contains(head)) {
				return true;
			} else {
				nodeSet.add(head);
				head = head.next;
			}
		}

		return false;
	}

	static int getNode(SinglyLinkedListNode head, int positionFromTail) {
		int index;

		if (head.next == null) {
			if (positionFromTail > 0) {
				return -(positionFromTail - 1);
			} else {
				return head.data;
			}
		} else {
			index = getNode(head.next, positionFromTail);
		}

		if (index > 0) {
			return index;
		}

		if (index == 0) {
			return head.data;
		}

		index++;
		return index;
	}

	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode mergedHead = null;
		SinglyLinkedListNode mergedNext = null;

		if (head1.data <= head2.data) {
			mergedHead = new SinglyLinkedListNode(head1.data);
			head1 = head1.next;
		} else {
			mergedHead = new SinglyLinkedListNode(head2.data);
			head2 = head2.next;
		}

		mergedNext = mergedHead;

		while (head1 != null || head2 != null) {
			if (head1 == null) {
				mergedNext.next = new SinglyLinkedListNode(head2.data);
				mergedNext = mergedNext.next;
				head2 = head2.next;
			} else if (head2 == null) {
				mergedNext.next = new SinglyLinkedListNode(head1.data);
				mergedNext = mergedNext.next;
				head1 = head1.next;
			} else {
				if (head1.data <= head2.data) {
					mergedNext.next = new SinglyLinkedListNode(head1.data);
					mergedNext = mergedNext.next;
					head1 = head1.next;
				} else {
					mergedNext.next = new SinglyLinkedListNode(head2.data);
					mergedNext = mergedNext.next;
					head2 = head2.next;
				}
			}
		}

		return mergedHead;
	}

	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		if (head1 == null && head2 == null) {
			return true;
		} else if (head1 == null || head2 == null) {
			return false;
		}

		if (!compareLists(head1.next, head2.next)) {
			return false;
		}

		return (head1.data == head2.data);
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

	static void printFlatLinkedList(SinglyLinkedListNode head) {
		SinglyLinkedListNode nextNode = head;
		StringBuilder sb = new StringBuilder();

		while (nextNode != null) {
			sb.append(nextNode.data + " => ");
			nextNode = nextNode.next;
		}
		sb.append("NULL");
		System.out.println(sb.toString());
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
