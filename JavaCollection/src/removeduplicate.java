import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int a[] = { 1,1,2,2,3,3};
//		
//		int l = a.length;
//		Set<Integer> st = new HashSet<Integer>();
//		List<Integer>li = new LinkedList<Integer>();
//		
//		
//		for(int i =0;i<=l-1;i++){
//			li.add(a[i]);
//		}
//	//	System.out.println(st);
//		Iterator<Integer> tr = st.iterator();
//		
//		for(int i=li.size()-1;i>=0;i--){
//			System.out.println(li.get(i));
//		}
//		
		String []s1 = {"hello","yes","Raj","hello","No","Raj"};
		
		Set<String> dup = new  HashSet<String>();		
		
		for(int i=0;i<s1.length-1;i++){
			dup.add(s1[i]);			
		}
		
		System.out.println(dup);

		Map<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("Yogesh", 1);
		Set<String>  s  = hm.keySet();
		for(String st : s){
			if(hm.get("Yogesh") == 2)
				System.out.println(st);
		}
		
		
	}
}
