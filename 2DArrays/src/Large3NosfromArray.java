/*
 * Find the largest three distinct elements in an array
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
		Output: 90, 50, 23
 */
public class Large3NosfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, first, second, third;
		third = first = second = Integer.MIN_VALUE;
		int arr3[] = { 12, 13, 1, 10, 34, 1 };
		for (i = 0; i <= arr3.length - 1; i++) {
			/*
			 * If current element is greater than first
			 */
			if (arr3[i] > first) {
				third = second;
				second = first;
				first = arr3[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr3[i] > second) {
				third = second;
				second = arr3[i];
			}

			else if (arr3[i] > third)
				third = arr3[i];
		}

		System.out.println("Three largest elements are " + first + " " + second + " " + third);

	}

}
