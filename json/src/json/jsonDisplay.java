package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class jsonDisplay {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		JSONArray[] A = new JSONArray[10];
		

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      
	    	  System.out.println(" each memeber of jason "+ obj);
	}

}
