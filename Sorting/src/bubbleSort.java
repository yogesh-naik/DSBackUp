public class bubbleSort {

	/**
	 * Write using Do .. While
	 * Time complexity = O(n2)
	 * Space complexity = O(1)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[] { 5, 90, 35, 45, 150, -23 };

		int n = intArray.length;
		int temp = 0;

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 1; j <= (n - i - 1); j++) {
				if (intArray[j - 1] > intArray[j]) {
					// swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(intArray[i]);
		}
	}
}