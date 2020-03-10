public class LinkedList2 {

	private  Node first =null;
	

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
				System.out.println("Values " + p); //System.out.println("ref"+first.next);
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

	// Add Middle element
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
	
	//Delete Middle
	void deleteMiddle(int data){
		
		Node p = first;
		Node t = p.next.next;
		
		while (p.next.data !=data && t !=null){
			p = p.next;
			t =t.next;
		}
		int X = p.next.data;
		System.out.println("Delete number " +X);
		
		Node temp = p.next;
		p.next = t;
		temp = null;
	}
	
	//reverse linkedList
	void reverseLL(){
		Node previous = null;
		Node current = first;
		Node Next = first;
		
		while(Next !=null){
			Next = Next.next;
			current.next = previous;
			previous = current;
			
			current = Next;
		}
		
		first = previous;
	}
	
//	
}
