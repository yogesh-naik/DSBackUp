
public class LinkedList {

	public Node first = null;

	public int size(Node temp) {
		int ct = 0;
		if (temp == null)
			return 0;
		else {

			while (temp != null) {
				ct++;
				temp = temp.next;
			}
			return ct;
		}
	}

	public void insertLast(Node temp, int data) {
		if (temp == null) {
			insertFirst(data);
			return;
		}
		{
			while (temp.next != null) {
				temp = temp.next;
			}
			Node temp1 = new Node(data);
			temp.next = temp1;
		}
	}

	public void insertFirst(int data) {
		Node n = new Node(data);
		n.next = first;
		first = n;
	}

	public int deleteFirst() {
		// Node current = first;
		int temp = first.data;
		first = first.next;
		return temp;
	}

	public int getFirst() {
		int temp = first.data;
		return temp;
	}

	public void displayList() {
		Node temp = first;
		// while (current != null) {
		// current.displayNode();
		// current = current.next;
		// }
		if (first == null) {
			System.out.println("Stack empty");
		} else {
			while (temp != null) {
				int p = temp.data;
				System.out.println("Values " + p); // System.out.println("ref"+first.next);
				temp = temp.next;
			}
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	// DeleteLast
	void deleteLast() {
		Node temp = first;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.data;
		System.out.println("last element " + data);

		temp.next = null;
	}

	// Add Middle element - count is number @ that position.
	// using 2 pointers
	void addMiddle(int data, int count) {
		Node p = first;
		Node t = null;

		// int ctr =1;
		for (int ctr = 0; ctr < count - 1; ctr++) {
			t = p;
			p = p.next;
		}

		Node newNode = new Node(data);

		newNode.next = p;
		t.next = newNode;
	}

	// Delete Middle
	void deleteMiddle(int data) {

		Node p = first;
		Node t = p.next.next;

		while (p.next.data != data && t.next != null) {
			p = p.next;
			t = t.next;
		}
		int X = p.next.data;
		System.out.println("Delete number " + X);

		Node temp = p.next;
		p.next = t;
		temp = null;
	}

	// reverse linkedList
	void reverseLL() {
		Node previous = null;
		Node current = first;
		Node Next = first;

		while (Next != null) {
			Next = Next.next;
			current.next = previous;
			previous = current;

			current = Next;
		}

		first = previous;
	}

	// using 2 pointers
	public void addMiddle2(int postion, int NumberToAdd) {
		int ctr = 1;
		Node temp = new Node(NumberToAdd);
		Node t2 = first;
		while (ctr != postion) {
			t2 = t2.next;
			ctr++;
		}
		temp.next = t2.next;
		t2.next = temp;
	}

	public void Reverse() {
		Node temp1 = null;
		Node temp2 = first;
		Node temp3 = temp2.next;

		while (temp2.next != null) {
			temp2.next = temp1;
			temp1 = temp2;
			temp2 = temp3;
			temp3 = temp3.next;
		}

		temp2.next = temp1;
		// temp1.next = null;
		first = temp2;

	}

	public void reverseLL2() {
		Node temp1 = null;
		Node temp2 = first, temp3 = first;

		while (temp3 != null) {
			temp3 = temp3.next;
			temp2.next = temp1;
			temp1 = temp2;
			temp2 = temp3;
		}

		first = temp1;
	}

	public void reverseLL3() {
		Node temp1 = first;
		Node temp2 = null, temp3 = null;

		while (temp1.next != null) {
			temp2 = temp1;
			temp1 = temp1.next;
			temp2.next = temp3;
			temp3 = temp2;
		}
		temp1.next = temp2;
		first = temp1;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);
		ll.deleteMiddle(3);

		ll.displayList();
		System.out.println("---------------");
		ll.addMiddle2(3, -100);
		ll.displayList();
		System.out.println("---------------");
		ll.addMiddle(-100, 3);
		System.out.println("---before reversal----");
		ll.displayList();
		ll.reverseLL2();
		System.out.println("---After reversal----");
		ll.displayList();

		System.out.println("-------");
		LinkedList l2 = new LinkedList();
		l2.insertFirst(0);
		l2.insertFirst(1);
		l2.insertFirst(2);
		l2.insertFirst(3);
		l2.insertFirst(4);
		l2.insertFirst(5);

		l2.displayList();

		l2.first.next.next.next.next.next.next = l2.first.next;
		System.out.println("pointing to node -> " + l2.first.next.data);
		System.out.println(l2.isLoop(l2.first));	
		System.out.println("After removing the loop now the linked list is -->");
		l2.displayList();
	}

	// Find out if loop exist in LinkedList
	public static boolean isLoop(Node node) {
		Node slow = node;
		Node fast = node;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop found in this node -->" + fast.data);
				findLoopStart(slow, node);
				removeLoop(node,fast);//In this method, 'node' nothing but starting from first/head node of LL i.e Node.first
				return true;
			}
		}
		return false;

	}

	// Find start node of the loop
	public static void findLoopStart(Node temp, Node start) {

		while (temp != null && start != null) {
			temp = temp.next;
			start = start.next;
			if (temp == start) {
				System.out.println("Start of loop : " + start.data);
				break;
			}
		}
	}

	//Remove loop from linked list
	public static void removeLoop(Node node, Node fast) {
		while (node.next != fast.next) {
			node = node.next;
			fast = fast.next;
		}
		/* since fast->next is the looping point */
		fast.next = null;
	}
	
	//Print the Linked list in reverse order
	//Recursive method
	public static void recursionPrint(Node temp) {
		if (temp.next == null) {
			System.out.println(temp.data);
			return;
		} else {
			recursionPrint(temp.next);
			System.out.println(temp.data);
		}
	}
	//Reverse First K nodes 
	//e.g K= 3.  
	//input = > 1,2,3,4,5
	//output => 3,2,1,4,5
	public void ReverseKNodes(Node temp,int n){
		int k = 1;
		
		Node t = temp;
		Node temp1 = temp; Node temp2 = temp;
		Node temp3 = temp.next;
		
		while(k<n){
			temp2 = temp3;
			temp3 = temp3.next;
			temp2.next = temp1;
			temp1 = temp2;
			k++;			
		}
		t.next = temp3;
		first = temp2;
	}
}
