
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

	public void insertLast(Node temp,int data) {
		if(temp == null){
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

	}
}
