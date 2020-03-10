import java.util.LinkedList;


public class ReverseStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		String rev = "dlroW olleH";
		
		boolean p = false;
		p = chkRevString(str,rev);
		if(p==true)
			System.out.println("Palindrome");
			else {
				System.out.println("Not Palindrome");
			}	
	}
	
	public static boolean chkRevString(String s,String p){
		
		p.toLowerCase();
		s.toLowerCase();
		
		if(s.length() !=p.length())
			return false;
		else{
			for(int i = 0;i<=s.length()-1;i++){
				if(s.charAt(i)!=p.charAt((p.length()-1)-i)){
					return false;
				}//end of if
			}//end of for loop				
		}
	return true;
		
	}

}
