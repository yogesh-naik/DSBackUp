import java.util.HashMap;

/*
 * Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
Output: 5
Explanation: The longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}
 */
public class LargestSubarraywith0Sum {

	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };

		subArray(arr);
	}

	static void subArray(int arr[]) {
		int tempsum = 0;
		int low = 0, high = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				low = i;
				tempsum = tempsum + arr[j];
				if (tempsum == 0) {
					high = j;
					flag = true;
				}
			}
			tempsum = 0;
			if (flag == true) {
				System.out.println("low-" + low + "---" + "high-" + high);
//				low = 0;
//				high = 0;		
//				flag = false;
				break;
			}

		}

		System.out.println("-----subarray -----");
		for (int i = low; i <= high; i++) {
			System.out.println(arr[i]);
		}
	}
}
