import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Find consecutive integers in a list that give you the biggest sum
 * like - -2 ,5 ,-1,7,3  => should give 5,-1,7
 */
public class consecutiveIntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> hs = new ArrayList<Integer>();

		int nums[] = { -2, -3, -4, -2, -1,1,5,-3}, i = 0, j = 0;
		int largestSum = 0, startIndex = 0, endIndex = 0;
		int tempSum = 0, tempSumBegin = 0;

		for (i = 0; i <= nums.length - 1; i++) {
			if (i == 0) {
				largestSum = tempSum = nums[i];
			}
			tempSum += nums[i];
			if (tempSum > largestSum) {
				largestSum = tempSum;
//				startIndex = tempSumBegin;
				endIndex = i;
			}
			if (tempSum < 0) {
				tempSum = 0;
				startIndex = i + 1;
				largestSum = 0;
				endIndex = i+1;
			}

		}
		System.out.println("Final Sum -> "+largestSum);
		System.out.println(startIndex);
		System.out.println(endIndex);

		for (int jk = tempSumBegin; jk <= endIndex; jk++) {
			hs.add(nums[jk]);
		}

		System.out.println("Consecutive number with highest sum " + hs);


		// Different method to calculate sum of differences of numbers in array
		int arr[] = { 1, 2, 3, 4 };
		absolteSum(arr); // This method

		System.out.println("--------My method --------");
		maxSubArraySum(nums);
		System.out.println("---------------");
		rotateArr();

	}

	// This method
	public static void absolteSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				int diff = arr[j] - arr[i];
				sum = sum + diff;
			}
		}
		System.out.println("AbsolteSum " + sum);
	}

	public static void maxSubArraySum(int a[]) {

		int start = 0;
		int end = 0;
		int sum = 0;
		int tempsum = 0;

		int begin =0;
		for (int i = 0; i <= a.length - 1; i++) {
			tempsum = tempsum + a[i];
			
			if(tempsum > sum){
				sum = tempsum;
//				begin = start;
				end = i;	
			}
			
			if(tempsum < 0){
				tempsum = 0;
				start = i+1;
			}
	
		} // end of for loop
		System.out.println(sum);
		System.out.println("start index -> "+start);
		System.out.println("end index -> "+end);
		for (int i = start; i <= end; i++)
			System.out.println("My method array " + a[i]);

	}
	
	public static void rotateArr(){
		int arr[] = new int[]{1, 2, 3, 4, 5}; 
		int x = arr[arr.length-1], i; 
	       for (i = arr.length-1; i > 0; i--) 
	          arr[i] = arr[i-1]; 
	       arr[0] = x; 
	       
	       for (i = 0;i<=arr.length-1;i++)
	    	   System.out.print(arr[i]);
	}

}
