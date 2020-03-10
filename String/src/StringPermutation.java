import java.util.Arrays;


public class StringPermutation {
	/*
	 * Just find out if 2 strings are permutation of each other
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello world";
		String s2 = "world hello";
		
		String s3 = convert(s1);
		String s4 = convert(s2);
		
		if(s3.equalsIgnoreCase(s4))
			System.out.println("Both are permutation of each other");
		else 
			System.out.println("Both are not permutations");
		
	}
	
	public static String convert(String s){
		char[]arr = s.toCharArray();;
		//arr = s.toCharArray();
		Arrays.sort(arr);
			
	//	return arr.toString();
		return new String(arr);
		
	}
	

}
