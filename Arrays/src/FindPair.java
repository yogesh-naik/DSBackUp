import java.util.ArrayList;
import java.util.List;

/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 */
public class FindPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		int[] A = { -8, 1, 4, 6, 10, 45 };
		int sum = 16;

		int l = 0, r = A.length - 1;
		System.out.println(findPair(l, r, A, sum));

	}

	// Using loop method
	public static boolean findPair(int l, int r, int[] A, int sum) {

		while (l < r) {
			int temp = A[l] + A[r];
			if (temp == sum) {
				System.out.println("Found the pair " + A[l] + "----" + A[r]);
				return true;
			} else if (temp < sum) {
				l++;

			} else if (temp > sum) {
				r--;
			}	
		}
		return false;
	}
}
