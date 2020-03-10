import java.util.Stack;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Dot sfaw I was Tod";
		int len = S.length();
		S = S.toLowerCase();
		boolean flag = false;
			
		for(int i=0;i<=(len)/2;i++){
			if(S.charAt(i)!=S.charAt((len-1)-i)){
				flag = true;
				break;
			}				
		}
		
		
		/*
		 * Below code does Palindrome check using stack;
		 */
		if(flag ==true)
			System.out.println("Not palindrome");
		else
			System.out.println("palindrome");
		
		S = "ababaXababa";
		Stack<Character> st = new Stack<Character>();
		boolean z = false;
		for(int i=0;i<=S.length()-1;i++){
			
		if(S.charAt(i)=='X'){
				z = true;
				i++;
		}
		  if(z==false)
			  st.push(S.charAt(i));
		
		
		if(S.charAt(i) != st.peek() && z==true){
			System.out.println("Not palindrome from method");
			break;
		}else if(z==true){
			st.pop();
			if(i==S.length()-1){
				System.out.println("palindrome from method");
			}
		}
	}//end of for loop
	}
}
