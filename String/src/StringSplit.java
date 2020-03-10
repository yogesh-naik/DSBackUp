

public class StringSplit {

	/**
	 * Writing alternate method to Split String.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		String p = str.substring(6, 9);
		
		System.out.println(p);
//		
//		char c = ' ';
//		String[] s = SplitMethod(str , c);
//		
//		for(int i=0;i<=s.length-1;i++)
//			System.out.println(s[i]);
	}

//	public static String[] SplitMethod(String str , char c){
//		
//		String arr[] = null;
//		
//		int k=0;
//		for(int i=0;i<=str.length()-1;){
//			int ctr = 0;
//			while(str.charAt(i) != ' ' || str.charAt(i)!='\0'){
//				i++;ctr++;
//			}
//			String p = str.substring(i-ctr-1,i);
//			arr[k++] = p;
//			System.out.println(p);
//			i++;				
//		}
//		return arr;
//	}
}
