public class StringPermutations {

	
	/*
	 * Write down all permutations of a String - " abc"
	 * Total permutation are 3! =6 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abc");
		

	}

	public static void permutation(String input) {
		permutation("", input,0);
	}

	public static void permutation(String perm, String word,int ctr) {
		int l = word.length();
		if (l==0) {
			System.out.println(perm);
		} else{
			for (int i = 0; i <= l-1; i++) {
//				System.out.println("Perm "+perm);
//				System.out.println("Word "+word);
//				System.out.println("i "+i);
				ctr++;
				permutation(perm + word.charAt(i),word.substring(0, i)+ word.substring(i + 1, word.length()),ctr);
			}
		}
	}
	
	public static void permutation2(String str) {
		String temp = null;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch= str.charAt(i);
			for (int j = 0; j <= str.length() - 1; j++) {
				 temp = str.substring(0, i) + str.substring(i + 1,str.length());
				 System.out.println(temp);
			}
			
		}
	}

	
}
