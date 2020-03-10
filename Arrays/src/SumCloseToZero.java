import java.util.Arrays;

/*
 * Two elements whose sum is closest to zero in given array
	int arr[] = {1, 60, -10, 70, -80, 85}; 
	output - -80 & 85
 */

//User Birnary search approach
public class SumCloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 60, -10, 70, -80, 85}; 
		Arrays.sort(arr); // sort array
		
		int low=0,high = arr.length-1;		
		int min_sum = Integer.MAX_VALUE;   //****************
		int min_low = 0,min_high =0;
		
		while(low < high){
			int sum = arr[low] + arr[high];
			if(Math.abs(sum) < Math.abs(min_sum)){
				min_sum = sum;
				min_low = low;
				min_high = high;
			} 

			 if(sum < 0) 
		         low++;
		        else
		          high--;
		} //end of while

		System.out.println("Lowest sum number 1 -> "+arr[min_low]);
		System.out.println("Lowest sum number 2 -> "+arr[min_high]);
	}

}
