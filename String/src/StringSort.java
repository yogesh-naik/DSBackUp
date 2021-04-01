import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
// Amazon interview Question ---
// input - String str = "Wzs it z czr or A czt I sBw";
//output - z4r2s2c2t2A1B1W1w1i1I1o1

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Wzs it z czr or A czt I sBw";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				if (hm.containsKey(str.charAt(i))) {
					int temp = hm.get(str.charAt(i));
					temp++;
					hm.put(str.charAt(i), temp);
				} else {
					hm.put(str.charAt(i), 1);
				}
			}
		}

		List<Integer> ll = new ArrayList<Integer>(hm.values());
		Collections.sort(ll); // Sort the linked list

		Set<Character> hs = hm.keySet();

		System.out.println("Required output String----");
		for (int i = ll.size() - 1; i >= 0; i--) {
			for (Character ch : hs) {
				if (hm.get(ch) == ll.get(i)) {
					System.out.print(ch);
					System.out.print(hm.get(ch));
					// After printing remove the entry to avoid duplicate print
					hm.remove(ch, hm.get(ch));
					break;
				}
			}
		}
	}

}
