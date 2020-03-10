import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/*
 *  Find the numbers which are repeated in the Array A[]
 *  IF  number is repeated then add in ArrayList
 *  Otherwise add it in HashTable
 */
public class findRepearNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer []A = {1,99,9,5,6,7,9,23,44,5,6,7,8,22,23,99};
		Arrays.sort(A);
		
		System.out.println();
		
		HashMap<Integer,Integer> HT = new HashMap();
		List<Integer>arrList = new ArrayList<Integer>();
		
		//Collections.addAll(arrList, A);
		arrList = Arrays.asList(A);
		//System.out.println("Yo "+arrList);
	
		
		for(int i=0;i<=A.length-1;i++){
			if(!(HT.containsKey(A[i]))){ //Checking the number is present in HashTable
				HT.put(A[i],1);
			}else{
				HT.put(A[i],HT.get(A[i])+1);
			}
			
		}
	
		Set<Integer>keys = HT.keySet();
		
		for( Integer k : keys){
			if(HT.get(k) !=1){
				System.out.println(k);
			}
		}
				
		String str = "The";
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<=str.length()-1;i++){
			sb = sb.append(str.charAt(i));
			sb = sb.append(str.charAt(i));
		}

			return sb.toString();

	}//end of method

}
