/*
 * Given 2 sorted arrays A,B. Merge them into Array A(it is bigger and has room
 */
public class Merge2SortArrayinto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 7, 9, 0, 0, 0, 0, 0, 0, };
		int b[] = { 0, 1, 3, 5, 6, 8};

		int i = 0;
		int j = 0;
		while (j <= b.length - 1) {
			while (i <= a.length - 1 && a[i] < b[j]) {
				i++;
			}
			shift(a, i, b[j]);
			j++;
		}
		for (i = 0; i <= a.length - 1; i++)
			System.out.println(a[i]);

	}

	public static void shift(int[] a, int start, int no) {
		int temp = a[start];
		a[start] = no;

		for (int i = start + 1; i <= a.length - 1; i++) {
			int t2 = a[i];
			a[i] = temp;
			temp = t2;
		}
	}

}
