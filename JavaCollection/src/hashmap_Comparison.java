import java.util.HashMap;
import java.util.Map;


public class hashmap_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//dataClass dt = new dataClass();
//		
//		Map map = new HashMap();
//	    map.put("key1", "value1");
//	    map.put("key2", "value2");
//	    map.put("key3", "value3");
//	    Map map2 = new HashMap();
//	    for(int i =0;i<=dt.a.length-1;i++)
//	    {
//	    	map2.put(dt.a[i], dt.b[i]);
//	    }
////	    map2.put("key2", "value2");
////	    map2.put("key1", "value1");
////	    map2.put("key3", "value3");
//
//	    if(map2.equals(map)){
//	    	System.out.println(map2.equals(map));
//	    }
//	    else{
//	    	System.out.println(map2);
//	    }
	    
	    String str = "abcxyz";
	    boolean flag = false;
	    for(int i=0;i<=str.length()-4;i++){
	    	if(str.substring(i,i+3).equals("xyz") && str.charAt(i-1) !='.'){
	    		flag = true;
	    	}
	    	
	    	if(flag == true)
	    		return true;
	    	else
	    		return false;
	    }
	    
	    
	}

}
