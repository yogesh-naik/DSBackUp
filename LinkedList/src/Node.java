
public class Node{
	public int data;
	public Node next;

	public Node(int data) {
	    this.data = data;
	   // this.next = null;
	}
	
	public Node(Node t){
		this.data = t.data;
		this.next = null;
	}

	public void displayNode() {
	    System.out.print(data);
	    System.out.print("  ");

	 }
}
