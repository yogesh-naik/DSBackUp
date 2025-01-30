import java.util.Arrays;

public class LongestCommonPrefix {

//	Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
//	Output: “gee”
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };

		Arrays.sort(arr);// Main point

		int ct = arr[0].length() - 1;

		for (int i = 0; i <= ct; i++) {
			if (arr[0].charAt(i) == arr[arr.length - 1].charAt(i)) {
				System.out.print(arr[0].charAt(i));
			} else {
				break;
			}
		}
	}
}
