
public class Reverse5Nodes {

	/*
	 * Input: 1,2,3,4,5,6,7 
		Output: 1,2,7,6,5,4,3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L1 = new LinkedList();
		int a[] ={1,2,3,4,5,6,7};
		
		for(int i=a.length-1;i>=0;i--)
			L1.insertFirst(a[i]);
		
		Node temp = L1.first;
		//L1.displayList();
		while(temp.next.data != 3){
			temp =temp.next;
		}
		Node temp2 = temp.next;
		
		temp.next = reverseLL(temp2);
		L1.displayList();
		
		/*
		 * Following code gives same solution but without Linkedlist(with loops) 
		 */
		int len = a.length;
		for(int i=2;i<=4;i++){
			//swap
			int tem = a[i];
			a[i] = a[len-1];
			a[len-1] = tem;
			len--;
		}
		for(int i=0;i<=(a.length-1);i++){
			System.out.println(a[i]);
		} // End of for loop
		
	}

	static Node reverseLL(Node p){
		
		Node previous =null;
		Node current = p;
		Node NextNode = p;
		
		while(NextNode != null){
			NextNode = NextNode.next;
			current.next = previous;
			previous =current;
			current = NextNode;					
		}
		
		p =previous;
		return p;
		//System.out.println(p.data);
	}

	
}
