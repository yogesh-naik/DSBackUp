import java.util.HashSet;
import java.util.Set;

/*
 * 
Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count. 

//countCode("aaacodebbb") → 1
//countCode("codexxcode") → 2
//countCode("cozexxcope") → 2
 */
public class countCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str = "cozexxcope";
		StringBuffer sb = new StringBuffer(str);
		
		int count =0;
		  for(int i =0;i<=str.length()-4;i++){
		      if(sb.substring(i,i+2).equals("co") && sb.charAt(i+3) =='e')
		    	  sb.replace(i,i+4,"ABCD");
		          //count++;
		  }
		  
		  System.out.println("Count is "+sb);
//		  
		  String pattern = "abc";
		  String longString = "abcssdfsdfsdfabcefsdfsdfsabc";

		  int l = pattern.length();
		  //int count =0;
		  for(int i=0;i<=longString.length()-3;i++){
		  if(longString.substring(i,i+3).equals(pattern)){
			  count++;
		  }

		  }
		  System.out.println(count);
		  
		  StrRead("coode&&&copde");
	}
	
	public static void StrRead(String str){
		int ct = 0;
		for(int i=0;i<=str.length()-5;i++){
			if(str.substring(i,i+2).equalsIgnoreCase("co") && str.substring(i+3, i+5).equalsIgnoreCase("de")){
				ct++;
			}
		}
		System.out.println(ct);
	}
	
	
}
