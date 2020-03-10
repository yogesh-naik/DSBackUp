/*
 * Carcking coding interview - Exercise 1.4
 */
public class ReplaceBackSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Mr Yogesh Naik  ";
		ReplaceSpace(s, 16);
		// System.out.println(s);
	}

	public static void ReplaceSpace(String s, int i) {
		char arr[] = null;
		int j = 0;

		for (j = i - 1; j >= 0; j--) {
			if (s.charAt(j) != ' ') {
				arr = new char[j];
				arr = s.toCharArray();
				break;
			}
		}

		for (i = 0; i <= j - 1; i++)
			if (arr[i] == ' ') {
				arr[i] = '%';
			}
		String sp = new String(arr);
		System.out.println(sp.length());

		StrReplace(s);
	}

	public static void StrReplace(String str) {
		int ctr = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ')
				ctr++;
			else
				break;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= str.length() - 1 - ctr; i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println("Final String --- " + sb.toString());

	}
}
