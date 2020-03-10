import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue Q = new Queue();
		
		Q.addLast(1);
		Q.addLast(2);
		Q.addLast(3);
		Q.addLast(4);
		Q.addLast(5);
		
		
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		System.out.println(Q.deleteFirst());
		
		
		Queue p = new Queue();
		
		
	
	}

}
