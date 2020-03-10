import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SecondLeastCommon {

	/*
	 * 
	 * [5,5,4,5,4,6,6,6,1,3,3,4,4,5,4] 
	 * 
	 * Reason: {1=1, 3=2, 4=5, 5=4, 6=3}
	 * 
	 * Answer = 3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] ={5,5,4,5,4,6,6,6,1,3,3,4,4,5,4};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<=a.length-1;i++){
			if(hm.containsKey(a[i])){
				int temp = hm.get(a[i]);
				temp++;
				hm.put(a[i],temp);
			}else{
				hm.put(a[i],1);
			}			
		}//for loop
		
		
		Set<Integer>hs = hm.keySet();
		List<Integer> valuesList = new ArrayList<Integer>(hs);
		Collections.sort(valuesList);
		//Collections.sort(hs.toArray());
		for( Integer i:hs)
		System.out.println("The number is "+i+" value"+hm.get(i));
		
		System.out.println(valuesList.get(1));
		
		String s = "cutcopypaste";
		String pt ="";
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++){
			if(hp.containsKey(s.charAt(i))){
				int t = hp.get(s.charAt(i));
				t++;
				hp.put(s.charAt(i), t);
			}else{
				hp.put(s.charAt(i),1);
			}			
		}
		Set<Character>ch = hp.keySet();
		for(Character p:ch){
			if(hp.get(p) ==1){
				pt = pt+p;
			}
		}
		System.out.println(pt);
	}
}
