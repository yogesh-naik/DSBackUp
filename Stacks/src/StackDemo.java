import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList2 li = new LinkedList2();
		
		li.insertFirst(100);
		li.insertFirst(200);
		li.insertFirst(300);
		li.insertFirst(500);
		
		li.addMiddle(400, 3);
		li.displayList();
	System.out.println();
//		li.deleteLast();
//		li.displayList();
		
		//li.addMiddle(400, 3);
		li.reverseLL();
		
		li.displayList();
		
	}
}
