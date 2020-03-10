import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class EvernoteQuestion {

	/*
	 * This is the method to return Strings and occurrences
	 * Assume filepath is correct & file exists;
	 * I/P - String filePath & number of items to return 
	 * O/P - Return the List of String(Words) and frequency as count
	 */
	public List<Entry<String, Integer>> countwords(String fpath,int frequency) throws IOException{
		HashMap<String,Integer> words = new HashMap<String,Integer>();
		
		FileReader fread = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fread); 
		String line = "";
			
		try {
			while((line = br.readLine()) != null){
				line.toLowerCase();    // Convert to lower case
				int i =0;
				String []wordArr= line.split(" ");
				while(i<=wordArr.length-1){
					if(words.containsKey(wordArr[i])){
						words.put(wordArr[i], words.get(wordArr[i])+1);  // Increase the value which is Integer in this case for word count
					}else {
						words.put(wordArr[i], 1);
					}//end of else
					i++; // increment the i
				}//end of while loop for			
			}//end of while
			br.close();
			fread.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Call the comparator method
		 List<Entry<String, Integer>> list = sortByValue(words);		 
		return list.subList(0, frequency);
	}
	
	//Comparator method to arrange the words as per frequency
	public List<Entry<String, Integer>> sortByValue(HashMap<String, Integer> wordMap){
        
        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }
	
	//Main Method to Test
	public static void main(String[] args) throws IOException {
		
		EvernoteQuestion EV = new EvernoteQuestion();
		//Call the method for testing purpose
		 List<Entry<String, Integer>> list = EV.countwords("c:\\s.txt",10);
		 		System.out.println("Word String"+"===="+"Frequency");
		 		
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.println(entry.getKey()+" ==== "+entry.getValue());
	        }

	}

}
