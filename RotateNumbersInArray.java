import java.util.Collections;
import java.util.LinkedList;


public class RotateNumbersInArray {

	/**
	 * Move the first n numbers in a 10 element array to the end.
	 * e.g first 3 to end array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		LinkedList<Integer>ls = new LinkedList<Integer>();
		for(int i :a)
			ls.add(i);	
		
		//Collections.reverse(ls);
		Collections.rotate(ls,3);
		
		
		System.out.println(ls);
		
		

	}

}
