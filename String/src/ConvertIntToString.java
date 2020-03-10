/*
 * Convert Int to string
 * 
 */
public class ConvertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 32345;
		StringBuffer sb = new StringBuffer();
		while(number>=1){
			int j = number%10;
		    	    
		   sb= sb.append(j);
		  	number = number/10;
			//System.out.println(number);
			if(number<10){
				sb =sb.append(number);break;
			}
		}
		System.out.println(sb.reverse());
		
		String s = "6789";
		int n =0;
		for(int i=0;i<=s.length()-1;i++){
			n = n*10;
			
			//n = n+s.charAt(i)-'0';
			//OR	
			n = n+Character.getNumericValue(s.charAt(i));

		}
		
		System.out.println("Number is "+n);
	}
	
	
	
}
