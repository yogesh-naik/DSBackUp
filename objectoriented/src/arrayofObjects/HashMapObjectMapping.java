package arrayofObjects;

import java.util.HashMap;
import java.util.Set;

public class HashMapObjectMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		personData dude = new personData();
		dude.setAge(20);
		dude.setName("Yogesh naik");
		
		personData hola = new personData();
		hola.setAge(30);
		hola.setName("Software Engineer");
		
		personData hawaii = new personData();
		hawaii.setAge(30);
		hawaii.setName("Software Engineer");
		
		//Here you are sending the object as Hashmap data
		HashMap<String,personData>OriginalHM = new HashMap<String,personData>();
		OriginalHM.put("object1", dude);
		OriginalHM.put("object2", hola);
		
		HMapPrint(OriginalHM);
	}//End of method
		
	
	//Method takes the hashmap object and print it.
	
		public static void HMapPrint(HashMap<String,personData>hm){
				
				
				Set<String>key = hm.keySet(); //Get all keys into set object
				for(String PD : key){  //Now iterate through each key object e.g PD in this case
					personData obj = hm.get(PD);
					System.out.println("Here is key "+PD+" "+obj.getAge());
					System.out.println("Here is  "+PD+" "+obj.getName());
				
			}
		}

}
