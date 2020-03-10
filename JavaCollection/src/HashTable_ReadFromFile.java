import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class HashTable_ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set HT
		HashMap<String, String> hm = new HashMap<String, String>();
		
try{
			//Set the filereaders
			FileReader fread = new FileReader("c:\\HashTablefile.txt");
			BufferedReader br = new BufferedReader(fread);
			
			//Start reading the file
			String line;
			while((line=br.readLine())!=null){
				if(line.contains(":")){
				String arr[] = line.split(":");
				//int i = 0;
				hm.put(arr[0],arr[1]);
				//System.out.println(arr[]);
				}//End of if lopp
				
			}//End of while lopp
	}catch(IOException e){
		System.out.println("Exception:"+e);
	}
	//Print the values from the hashtable


	Set<String> keys = hm.keySet();
	for(String key: keys){
		System.out.println(key+": "+hm.get(key));
	}
	

	}//End of main
}//End of class
