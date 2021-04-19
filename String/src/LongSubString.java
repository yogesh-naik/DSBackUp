import java.util.LinkedHashSet;
import java.util.Set;


//Find longest substring without repeating characters
public class LongSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongString("GEEKSFORGEEKS");
	}

	public static void LongString(String str) {

		int start = 0, end = 0, length = 0;

		Set<Character> hs = new LinkedHashSet<Character>();
		Set<Character> last = new LinkedHashSet<Character>();

		for (int i = 0; i <= str.length() - 2; i++) {
			if (!hs.contains(str.charAt(i))) {
				hs.add(str.charAt(i));
			} else {
				if (hs.size() > last.size()) {
					last = new LinkedHashSet<Character>(hs);
					hs = new LinkedHashSet<Character>();
				}
			}

		}

		System.out.println("Longest String without repetition of character -" + last);
	}

}
