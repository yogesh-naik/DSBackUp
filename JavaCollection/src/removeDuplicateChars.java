import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


/*
 * Remove the duplicate of chars from Strings
 * Again O(n) is iteration and not 2 for loops
 */
public class removeDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = { 'C','D','h','H','S', 'P','C','D','H','S' ,'A','C','P','D','H','S','r'};
		
		int l = arr.length;
		
		Hashtable<Character, Integer>charcount = new Hashtable<Character, Integer>();
		Set<Character> st = new HashSet<Character>();
		
		for(int i=0;i<=l-1;i++){
			if(!(charcount.containsKey(arr[i]))){
				charcount.put(arr[i], 1);
				//st.add(arr[i]);
			}
		}
		
		//print the values.
		
		System.out.println("Here is chars "+charcount.keySet());
		
		System.out.println(st);
	}
}
