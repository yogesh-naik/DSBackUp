
public class MoveSpeaces {

	public static void main(String[] args) {

		String input[] = { "ab", "cd", "f", "ab", "ef", "fdfabc" };

		int ctr = 0;

		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i].matches("(.*)ab(.*)")) {
				ctr++;
			}
		}

		System.out.println(ctr);

		// Move spaces to left
		String str = "yo ge sh na  ik";
		char[] s = str.toCharArray();
		 moveSpaceAtFront(s);
		 System.out.println("Spaces moved at Front of string --->"+String.valueOf(s));
		moveSpaceAtBack(s);
		System.out.println("Spaces moved at back of string --->" + String.valueOf(s));
	}

	// This function moves spaces at the begining
	public static void moveSpaceAtFront(char[] s) {

		int i = s.length - 1;

		for (int j = i; j >= 0; j--) {
			if (s[j] != ' ') // **********
				s[i--] = s[j]; // **********
		}
		// Move spaces to be beginning
		while (i >= 0)
			s[i--] = ' ';

	}

	// This function moves spaces at the end of string
	public static void moveSpaceAtBack(char[] s) {
		int j = 0;
		for (int i = 0; i <= s.length - 1;) {
			if (s[i] != ' ') { // ********** Imp
				s[j] = s[i]; // ********** imp
				j++;
			}
			if (s[i] == ' ')  // ********** not else if
				i++;
			else {
				i++;     // **********
			}
		}

		// Move spaces to the END of string
		 while (j<=s.length-1)
		 s[j++] = ' ';

	}
}
