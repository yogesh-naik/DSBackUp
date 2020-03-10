import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer A[] = { 2, 3, 5 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		for (Integer i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);

		Set<Integer> p = hm.keySet();

		for (Integer i : p) {
			System.out.println(hm.get(i));
		}

		int i = 0;
		al.contains(A[i]);

		// int a = 8743568;
		// String s = Integer.toString(8743568); //CONVERT INT TO STRING
		// char arr[] = s.toCharArray();
		//
		// //convert String to Integer
		// String s1 = "1223";
		// int ii = Integer.parseInt(s1);
		// System.out.println(ii);
		//
		// Arrays.sort(arr);
		// //System.out.println(new String(arr));
		//
		// String S = new String();
		//
		// StringBuffer sb = new StringBuffer();
		// for(int i1 =arr.length-1;i1>=0;i1--)
		// //S =S+arr[i1];
		// sb.append(arr[i1]);
		//
		// System.out.println(sb);

		int ar[] = { 30, 11, 12, 1, 2, 3, 5, 6, 7, 14, 20 };
		int N = 5;
		for (int i1 = 0; i1 <= ar.length - 2; i1++) {
			for (int p1 = 0; p1 <= ar.length - 1; p1++) {
				if ((N - ar[p1]) == ar[i1]) {
					System.out.println("Pair " + ar[p1] + "  " + ar[i1]);
				}
			}
		}
		Arrays.sort(ar);

		// for(int i1 =0;i1<=ar.length-1;i1++)
		// System.out.println("herere" + ar[i1]);

		int a[] = new int[52];

		for (i = 1; i < 52; i++) {
			a[i] = i;

		}
		for (i = 1; i < 52; i++) {
			// System.out.println(i);
			Random rnd = new Random();
			int temp = rnd.nextInt(52);

			int pt = a[i];
			a[i] = a[temp];
			a[temp] = pt;
		}
		System.out.println("---------");
		for (i = 1; i < 52; i++) {
			System.out.println(a[i]);

		}
	}
}
