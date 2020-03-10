import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test {

	private static final boolean[] String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 0; i < 101; i++) {
		// if (i % 2 == 0) {
		// System.err.println(i);
		// } else
		// System.out.println(i);
		// }

		// String arr[] = {"svp","cma","amz","pvs","sbz","amc"};
		// String arr2[] = new String[arr.length];
		// //{"god", "dog", "abc", "cab", "man"};
		// List<String> myList = new ArrayList<String>();
		// myList =Arrays.asList(arr);
		// StringBuffer sb;
		// Iterator<String> itr = myList.iterator();
		// for(int i = 0;i<=arr.length-2;i++){
		// for(int j =i+1;i<=arr.length-1;j++){
		// sb=new StringBuffer(arr[i]);
		// // if( == str[j])
		// }
		//
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\n String before reverse:" + string);
		System.out.println("String after reverse: " + reverse);

		String str = " Hello Yogesh naik  sirji";
		char[] arr = str.toCharArray();
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == ' ') {
				// arr[i]='%20';

			}
		}

		String str1 = "WaterbottleWaterbottle";
		String s2 = "erbottleWat";

		str1 = str1 + str1;
		StringBuffer sb = new StringBuffer(str1);
		// sb.sub
		// if(String [] s3=str1.split(s2){
		//
		// }

		int p = countCode("codexco");

		System.out.println("Count " + p);

		String s = "bbddfsssaadd";

		ArrayList<Character> ll = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			ll.add(s.charAt(i));
		}

		Collections.sort(ll);

		System.out.println(ll.toString());
		
		printMethod();
	}

	private static void isSubstring(String str1, String s2) {
		// TODO Auto-generated method stub

	}

	public static int countCode(String str) {
		int count = 0;

		if (str.length() < 5) {
			return 0;
		}
		for (int i = 0; i <= str.length() - 5; i++) {
			if (str.substring(i, i + 2).equals("co") && (str.substring(i + 3, i + 5).equals("ex"))) {
				count++;
			}
		}

		return count;
	}

	public static void printMethod() {
		int i, j, k = 1;
		int no =1;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <=i; j++) {
				System.out.print(no+" ");
				no++;
			}
			//k = k + 1;
			System.out.println();
		}
	}
}
