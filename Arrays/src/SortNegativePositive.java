
public class SortNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, -11, -13, -5, -5, -7, 5, -3, -6 };

		int low = 0, high = a.length - 1;

		while (low < high) {
			if (a[low] < 0 && a[high] < 0) {
				low++;
			} else if (a[low] > 0 && a[high] < 0) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			} else if (a[low] > 0 && a[high] > 0) {
				low++;
				high--;
			}
			if (a[low] < 0 && a[high] > 0) {
				low++;
				high--;
			}
		}

		for (int s : a) {
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
