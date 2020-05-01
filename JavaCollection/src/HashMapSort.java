mport java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//HashMap sorting by Values using Comparator

public class HashMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hmap = new HashMap<String,Integer>();

		hmap.put("A",50);
		hmap.put("C",23);
		hmap.put("Z",5);

		hmap = sortByValues(hmap);
		
		Set<String> hk = hmap.keySet();
		for(String str:hk){
			System.out.print(str);
			System.out.println(hmap.get(str));
		}

	}

	public static HashMap sortByValues(HashMap map) {
		 // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer>>(map.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
	}
}
