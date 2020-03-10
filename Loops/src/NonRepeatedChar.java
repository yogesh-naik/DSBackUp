import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/*
 * Find a 1st non-repeated char in the string for e.g. if 
 * string is "Salesforce is the best company to work for” returns 'l'
 */
public class NonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Salesforce is the best company to work for” returns";
		str = str.toLowerCase();
		for(int i=0;i<=str.length()-2;i++){
			int ctr =0;
			for(int j=i+1;j<=str.length()-1;j++){
				if(str.charAt(i) == str.charAt(j)){
					ctr++;
					//break;					
				}
			}if(ctr==0){
				System.out.println("Character is "+str.charAt(i));
				break;
			}
		}
	
		HashMap<Character, Integer>ch = new HashMap<Character, Integer>();
		ch.put('c', 2);
		ch.put('d', 1);
		ch.put('r', 5);
		
		Set<Character> pt = ch.keySet();
		for(Character ct :pt){
			System.out.println("Keys "+ct+" Values "+ch.get(ct));
		}
	
		String str2 ="00000110";
		int x=Integer.parseInt(str2,2);
		
		System.out.println(x);
		 if (x ==2 ) { System.out.println(" Prime number"); return ;}
	        for(int i =2; i <= Math.sqrt(x); i++ )
	            if (x %i == 0) {
	                System.out.println(" No Prime number:" + i );
	                //return ;
	                break;
	            }else{
	            	System.out.println(" Prime number");
	            }	
	        
	        int a =8754365;
	        String s = Integer.toString(8754365);
	        char ap[] = s.toCharArray();
	        
	        Arrays.sort(ap);
	        String p = "";
	        for(int i=ap.length-1;i>=0;i--)
	        	p = p + ap[i];
	        
	        System.out.println(Integer.parseInt(p));
	}

}
