import java.util.LinkedList;
import java.util.List;


public class phoneDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = letterCombinations("01");
		System.out.println(str);
	}

	public static List<String> letterCombinations(String digits) {
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> rec = new LinkedList<>();
        StringBuilder string = new StringBuilder();
        letterCombinations(digits, 0, letters, string, rec);
        return rec;
    }
    
    private static void letterCombinations(String digits, int number, String[] letters, StringBuilder string, List<String> rec) {
        if (digits.length() == number) {
            rec.add(string.toString());
            return;
        }
        String letter = letters[digits.charAt(number) - '2'];
        for (int i = 0; i < letter.length(); i++) {
            string.append(letter.charAt(i));
            letterCombinations(digits, number + 1, letters, string, rec);
            string.deleteCharAt(string.length() - 1);
        }
    }
}
