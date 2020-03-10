import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class treeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final Map<Integer,String> counts = new LinkedHashMap<Integer,String>();
//		counts.put(4,"four");
//		counts.put(1,"one");
//		counts.put(3,"three");
//		counts.put(2,"two");
//		
//		final Iterator<Integer> keys = counts.keySet().iterator();
//		System.out.println(Integer.valueOf(1));
//		System.out.println(Integer.valueOf(2));
//		System.out.println(Integer.valueOf(3));
//		System.out.println(Integer.valueOf(4));
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(55);
		al.add(100);
		al.add(1);
		
		Integer[]p = new Integer[al.size()];
		
		al.toArray(p);
		
		System.out.println("Printing array");
			for(int i=0;i<=p.length-1;i++)
				System.out.println(p[i]);
		
				
		Collections.sort(al);
		System.out.println();
		System.out.println(al);
		
		Set<Integer> st = new HashSet<Integer>();
		
		int [] p1 = {4,34,4};
		
		
		for(int i:p1){
			st.add(i);
		}
		System.out.println(st);
		
	}

}
