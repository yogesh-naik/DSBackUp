
public class CharArrayReverse {
/*
 *  java method that takes a character array and returns a character array 
 *  containing the same elements but in reverse order. 
 *   Example input: [a, x, y, d, d]  Example output: [d, d, y, x, a]
 */
	public static void main(String[] args) {
				
		char a[] = {'a', 'x', 'y', 'd', 'd'};
		char []aRev = Reverse(a);
		System.out.println(aRev);
	}

	/*
	 * Method to reverse the character array
	 * input = char array
	 * output = reverse char array
	 */
	public static char[] Reverse(char[]a){
		
		int alen = a.length;
		char[]b = new char[alen]; //char array to reverse
		int j =0;
		for(int i=alen-1;i>=0;i--){
			b[j] = a[i];
			j++;
		}
		
		return b; // return reverse char array
	}
	
}
