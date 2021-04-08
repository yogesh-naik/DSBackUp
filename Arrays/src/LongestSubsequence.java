import java.util.HashSet;
import java.util.Set;

public class LongestSubsequence {
/*
  Find longest sub sequnces in array int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
  Output: 5
Explanation: 
The subsequence 36, 35, 33, 34, 32 is the longest 
subsequence of consecutive elements.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};

		Set<Integer> st = new HashSet<Integer>();
		for (int i = 0; i <= arr.length - 1; i++) {
			st.add(arr[i]);
		}

		int temp = 0, ctr = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (st.contains(arr[i])) {
				//temp++;
				int t = arr[i];
				while (st.contains(t)) {
					t = t + 1;
					temp++;
				}
				if (temp > ctr) {
					ctr = temp;
					temp = 0;
				}else {
					temp =0;
				}
			}

		}
		
		System.out.println("Longest sub sequence -"+ctr);
	}

}
