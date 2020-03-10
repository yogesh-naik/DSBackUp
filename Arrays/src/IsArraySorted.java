/*
 * Using recursion find if Array is Sorted or not
 */
public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 2, 14, 5, 12 };

		boolean flag = isSorted(0, A);
		if (flag == true)
			System.out.println("Arrays SORTED");
		else
			System.out.println("NOT SORTED");

	}

	public static boolean isSorted(int i, int A[]) {
		if (i == A.length - 1)
			return true;
		else if (A[i] < A[i + 1])
			return isSorted(i+1, A);
		else
			return false;
	}

}
