import java.util.HashMap;
import java.util.Set;


public class HashTable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        //add key-value pair to Hashtable
	        hm.put("first", 1);
	        hm.put("second", 2);
	        //hm.put("third","THIRD INSERTED");
//	        System.out.println(hm);
	        Set<String> keys = hm.keySet();
	        System.out.println("Keys"+keys);
	        for(String key: keys){
	           System.out.println("Value of "+key+" is: "+hm.get(key));
	        }
	        System.out.println("The value "+ hm.get("first"));
	        
	        
	        Set<Integer> v = hm.values();
	        for(Integer pt:v)
	        System.out.println(pt);
//	        Hashtable<String, String> subMap = new Hashtable<String, String>();
//	        subMap.put("s1", "S1 VALUE");
//	        subMap.put("s2", "S2 VALUE");
//	        hm.putAll(subMap);
//	       // System.out.println(hm);
//	        
//	        
//	        subMap.putAll(hm);
//	        System.out.println(subMap.values());

	}

}
