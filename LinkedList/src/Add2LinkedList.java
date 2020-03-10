public class Add2LinkedList extends LinkedList {

	public static void padZeros(LinkedList ll, int diff) {
		while (diff != 0) {
			ll.insertLast(ll.first,0);
			diff--;
		}
	}

	public static LinkedList Addition(LinkedList l1, LinkedList l2) {
		LinkedList l3 = new LinkedList();

		int carry = 0;
		l1.Reverse();
		System.out.println("-----");
		l1.displayList();
		System.out.println("-----");
		l2.reverseLL2();
		l2.displayList();

		int diff = l1.size(l1.first) - l2.size(l2.first);

		if (diff <= -1) {
			padZeros(l1, diff);
		}
		if (diff > 0) {
			padZeros(l2, diff);
		}

		System.out.println("--after padding---");
		l2.displayList();
		
		Node t1 = l1.first;
		Node t2 = l2.first;
		while( t1 !=null && t2!=null){
			
			int tempsum = t1.data + t2.data + carry;
			if(tempsum >9){
				carry = tempsum /10;
				l3.insertFirst(tempsum %10);
			}else{
				l3.insertFirst(tempsum);
				carry =0;
			}
			t1 = t1.next;
			t2 = t2.next;
		}
		System.out.println("--after addition---");
		//l3.displayList();
		return l3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		// First number is 617
		l1.insertFirst(7);
		l1.insertFirst(1);
		l1.insertFirst(6);

		// Second number is 29
		LinkedList l2 = new LinkedList();
		l2.insertFirst(8);
		l2.insertFirst(2);
		LinkedList l = Addition(l1, l2);
		l.displayList();

	}

}
