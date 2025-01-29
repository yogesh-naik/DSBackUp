
public class MaxPRoductSubArray {
	// Maximum Product Subarray
//	Input: arr[] = {-2, 6, -3, -10, 0, 2}
//	Output: 180
//	Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-2, 6, -3, -10, 0, 2};

		int l = 0, h = 0;
		int prod = a[0];

		for (int i = 0; i <= a.length - 1; i++) {
			int tempProd = 1;
			for (int j = i; j <= a.length - 1; j++) {

				tempProd = tempProd * a[j];
//				prod = Math.max(tempProd, prod);
				if (tempProd > prod) {
					prod = tempProd;
					l = i;
					h = j;

				}
			}
		}
		System.out.println(prod);
		System.out.println(l);
		System.out.println(h);

	}
}
