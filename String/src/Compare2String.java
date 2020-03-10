import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Compare2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compare("1332  "));

		System.out.println(compareString("yogesH", "yogesh"));

		System.out.println("Factorial - " + Factorial(4));
		String s = "yooesh";
		String p = "yogesh";
		LinkedList<Character> ch = new LinkedList<>();

		for (int i = 0; i <= s.length() - 1; i++) {
			ch.add(s.charAt(i));
		}
		for (int i = 0; i <= p.length() - 1; i++) {
			if(ch.contains(p.charAt(i))){
				char ct = p.charAt(i);
				ch.remove(new Character(ct));
			}
		}
		
		if(ch.size()==0)
			System.out.println("Both String are matched");
	}

	public static boolean compare(String str) {
		int n = str.length();

		// Empty string
		if (n == 0)
			return false;

		// If there is single digit
		if (n == 1)
			return ((str.charAt(0) - '0') % 3 == 0);

		// If number formed by last two digits is
		// divisble by 4.
		int last = str.charAt(n - 1) - '0';
		int second_last = str.charAt(n - 2) - '0';
		return ((second_last * 10 + last) % 3 == 0);
	}

	// Compare 2 Strings
	public static boolean compareString(String s1, String s2) {
		int i = 0;
		if (s1.length() == 0 && s2.length() == 0)
			return true;
		if (s1.length() != s2.length())
			return false;
		if (s1.charAt(i) != s2.charAt(i))
			return false;
		else {
			i++;
			return compareString(s1.substring(i), s2.substring(i));
		}
	}

	public static int Factorial(int n) {
		if (n == 0)
			return 1;
		else {
			return n * Factorial(n - 1);
		}
	}

}
