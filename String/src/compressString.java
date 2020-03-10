import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/*
 * Cracking coding interview - 1.4
 */

public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bbbaacdddd";
		List<Integer> al = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if ((hm.containsKey(s.charAt(i)))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		// StringBuffer sb = new StringBuffer();
		Set<Character> HP = hm.keySet();

		s = new String();
		for (Character p : HP) {
			s = s + p;
			Integer st = hm.get(p);
			char cp = (char) (st + '0');
			s = s + cp;
			// sb.append(p);
			// sb.append(hm.get(p));
			// System.out.println(hm.get(p));
		}

		// s = sb.toString();
		System.out.println(s);

		String str = CompreseStr("aabbbcddddpe");
		
		System.out.println("Conventional method "+str);
	}

	// Compress string method with normal for loop(without hashmap)
	public static String CompreseStr(String str) {
		int ctr = 1;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				ctr++;
			}
			else{
				sb.append(str.charAt(i));
				sb.append(ctr);
				ctr = 1;
			}
			if(str.charAt(i) != str.charAt(i + 1) && i == str.length()-2){
				sb.append(str.charAt(i+1));
				sb.append(ctr);
				ctr = 1;
			}
		}
		
		return sb.toString();
	}

}
