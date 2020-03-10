/*
 * Find the Rotation Count in Rotated Sorted array	
 * Input : arr[] = {15, 18, 2, 3, 6, 12}
	Output: 2
 */
public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 9, 11, 12, 5 };
		int no = rotationCount(arr, 0, arr.length - 1);
		System.out.println("Array roatated times - " + no);

	}

	public static int rotationCount(int a[], int l, int h) {
		if (l < h) {
			int mid = l + (h - l) / 2;

			if (a[mid] > a[mid + 1]) { //condition to check rotation of array
				return mid + 1;
			}
			if (a[mid] < a[h]) {
				return rotationCount(a, 0, mid - 1);
			} else {
				return rotationCount(a, mid + 1, h);
			}
		}
		return -1;
	}
}
