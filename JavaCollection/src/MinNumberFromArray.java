import java.util.ArrayList;
import java.util.Arrays;



public class MinNumberFromArray {

	/**
	 * Find the minNumber in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = { 2,-4,54,1,-200,100,2,4,5,1,};
		ArrayList<Integer> ht = new ArrayList<Integer>();
		
		Arrays.asList(A).contains(23);
	
		int min = A[0];
		for(int i =1;i<A.length-1;i++){
			if(A[i]<min)
				min = A[i];
		}
		System.out.println(min);
	}

}
