import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/*
 * A String is given ilke--abdecadc...szx..any thing..like this...element in this given pattern can be any this(like int also and letter till z also) 
you have to arrange in pattern--aabbcclike....ie.same charactor together...
e.g String a = abdsbdsjdboweporpmfwdsqad
 after sort a = aabbbccddddee...
 */
public class SortString {
	
	private SortString(int p){
//		/this.p =p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdsbdsjdboweporpmfwdsqad";
		//StringBuffer strbuf = new StringBuffer(str.length());
		
		
		char arr[] = str.toCharArray();
		
//		
//		for(int i = 0;i<=str.length()-2;i++){
//			for(int j=i+1;j<=str.length()-1;j++){
//				int count=0;
//				if(arr[i]==arr[j]){
//					count++;
//				}//end if loop
//				
//			}//End of j loop
//		}
		
		Arrays.sort(arr);
		//str =arr.toString();
		for(int i = 0;i<=arr.length-1;i++){
			//System.out.print(arr[i]);
		}
		
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = new String("abc");
	
		String s = "Yogesh is good";
		String []str1 = s.split(" ");
		 s = new String();
		for(int i=0;i<=str1.length-1;i++){
			if(!str1[i].equals("is")){
				s = s +str1[i];
				if(i<str1.length-1)
					s =s+" ";
			}			
		}
		
	HashMap<Character, Integer> hm = new HashMap<>();
	hm.put('a', 2);
	hm.put('b', 4);
	hm.put('c', 3);
	StringBuffer sb = new StringBuffer();
	Set<Character> hs = hm.keySet();
	for(Character ch:hs){
		for(int i=0;i<=hm.get(ch)-1;i++){
			sb.append(ch);
		}
	}
	System.out.println(sb.toString());
		
	}

}
