//String copy method using Recursion

public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "yogesh";
		String s2 =  new String();
		StringBuffer sb = new StringBuffer();
		int i = 0;
		//s2 =strCopy(s1, s2, i);
		System.out.println(s2);
		
//		char s1[] = "GEEKSFORGEEKS".toCharArray(); 
//        char s2[] = new char[s1.length]; 
//        int index = 0; 
//        myCopy(s1, s2, index); 
//        System.out.println(String.valueOf(s2)); 
		
		myCopy2(s1,sb,i);
		System.out.println(sb.toString());
		
		System.out.println(Character.isDigit('.'));

	}

	public static String strCopy(String s1, String s2, int i) {
		if (i == s1.length()) {
			return s2;
		} else {
			s2 = s2 + s1.charAt(i);
			return strCopy(s1, s2, i + 1);
		}

	}

	static void myCopy(char s1[], char s2[], int index) {
		// copying each character from s1 to s2
		s2[index] = s1[index];

		// if string reach to end then stop
		if (index == s1.length - 1) {
			return;
		}
		// increase character index by one
		myCopy(s1, s2, index + 1);
	}

	static void myCopy2(String s1,StringBuffer sb, int i) {
		if (i == s1.length()) {
			return;
		}else{
			sb.append(s1.charAt(i));
			myCopy2(s1,sb,i+1);
		}
	}
}
