
public class NewLL {

	private  Node first;
	private  Node last;
	
	public NewLL(){
		first = last = null;
	}
	
	public boolean isEmpty(){
		if(first == null && last == null)
			return true;
		else
			return false;
	}
	public boolean addFirst(Node N){
		Node temp = new Node(N);
		if(first == null){
			first = temp;
			last = first;
			return true;
		}else{
			temp.next = first;
			first = temp;
			return true;
		}			
	}// End of AddFirst
	
	public boolean addLast(Node N){
		Node temp = new Node(N);
		if(last == null){
			last = temp;
			first = last;
			return true;
		}else{
			last.next = temp;
			last = temp;
			return true;
		}
	}
	
	public boolean addMiddle(Node N){
		
		Node temp =	new Node(N);
		//for first node
		if(first == null){		
			first = temp;
			last = first;
			return true;
		}
		//For 1 node case
		if(first.next == null){
			if(first.data < N.data)
				addLast(N);
			else
				addFirst(N);
		}
		//for 2 node case
		if(first.data > N.data)
			return addFirst(N);
		else if(last.data < N.data)
			return addLast(N);
		else{	
				Node temp1 = first;
				Node temp2 = temp1.next;
			while(temp2.data <N.data && temp2.next !=null){
				temp1 = temp2;
				temp2 = temp1.next;
			}
				temp.next = temp1.next;
				temp1.next = temp;
				return true;
		}//end of else
		//return false;
	}
	
	public void display(){
		
		Node temp = first;
		if(temp ==null){
			System.out.println("LinkedList is empty");
		}else{
			while(temp!=null){
				System.out.println(" Node is - "+temp.data);
				temp = temp.next;
			}
		}
	}
	
	public boolean deleteFirst(){
		Node temp;
		if(isEmpty())
			return false;
		else{
			temp = first;
			first = first.next;
			System.out.println("The deleted first node is ="+temp.data);
			temp = null;
			return true;
		}
	}
	
	public boolean deleteLast(){
		Node temp;
		if(isEmpty())
			return false;
		else if(first == last){
			System.out.println("The last node deleted is "+last.data);
			first = last = null;
			return true;
		}else{
			temp = first;
			while(temp.next != last){
				temp = temp.next;
			}
			System.out.println("The last deleted node is "+last.data);
			temp.next = null;
			last = temp;
			return true;
		}
	}
	
	public boolean deleteMiddle(int no){
		Node temp;
		if(isEmpty()){
			return false;
		}
		//Condition for 1 node only
		else if(first == last && first.data == no){			
				System.out.println("Number found @ first position ");
				first = last = null;
				return true;
			}
		else{
				temp = first;
				//condition for 2 nodes and last node
				if(temp.next == last && last.data == no){
					System.out.println("Node found at last position out of 2 nodes");
					temp.next =null;
					last = temp;
					return true;
				}
				//condition for 2 nodes and first node
				if(temp.next == last && temp.data == no){
					System.out.println("Node found at first position out of 2 nodes ");
					first = first.next;
					return true;
				}//Find middle node 
				if(temp.next != last){
					Node temp2 = temp.next;
					while(temp2.data != no && temp2.next !=null){
						temp = temp.next;
						temp2 = temp.next;
					}
					if(temp2.data == no){
						if(temp2 ==last)
							return deleteLast();
						temp.next = temp2.next;
						temp2.next=null;
						System.out.println("Node found in middle and deleted");
						return true;
					}
				}else{
					System.out.println("Node not in list");
					return false;
				}
			System.out.println("Node not in list");
			return false;	
		}
	}
	
	public boolean update(int no,Node node){
		if(deleteMiddle(no) == false)
			return false;
		else if(addMiddle(node) == false)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Node l1 = new Node(3);
		Node l2 = new Node(10);
		
		Node l3 = new Node(6);
		Node l4 = new Node(4);
		Node l5 = new Node(9);
		Node l7 = new Node(7);
		
		NewLL LL = new NewLL();
		LL.addFirst(l1);
		LL.addLast(l2);	
		
		LL.addMiddle(l3);
		LL.addMiddle(l4);
		LL.addMiddle(l5);
		
		
		Node l6 = new Node(3);
//		LL.addLast(l1);
//		LL.addFirst(l2);
//		LL.addLast(l1);LL.addFirst(l2);LL.addFirst(l1);
//		LL.addMiddle(l7);
//		LL.addMiddle(l4);
		//LL.addLast(l1);
		
//		LL.deleteFirst();
//		LL.deleteFirst();
//		LL.deleteFirst();
//		LL.deleteFirst();
//		LL.deleteLast();
//		LL.deleteLast();
//		LL.deleteLast();
//		LL.deleteLast();
//		LL.deleteLast();
//		LL.deleteFirst();
		
//		LL.deleteMiddle(4);
		//LL.deleteMiddle(3);
		
//		LL.deleteMiddle(3);
		
//		LL.deleteMiddle(10);
//		LL.deleteMiddle(9);
//		LL.deleteMiddle(3);
//		LL.deleteMiddle(6);
//		LL.deleteMiddle(3);
		
		LL.update(6, l7);
		LL.display();
	}
}
