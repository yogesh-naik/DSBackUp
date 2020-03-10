import java.io.BufferedReader;
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


public class HM_readFromFile2 {

	/*
	 * Method to input the file and return hashmap with number of words in it.
	 */
	public static HashMap<String, Integer> countwords(String fpath) throws IOException{
		HashMap<String,Integer> words = new HashMap<String,Integer>();
		
		FileReader fread = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fread); 
		String line = "";
		
		System.out.println("Method called");
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
		br.close();fread.close();
		
		return words;
	}
	
	//Comparator method to arrenge the words as per frequency
	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
        
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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HM_readFromFile2 hm = new HM_readFromFile2();
		// getValues from Hashmap from the function/method
		HashMap <String,Integer> getWords = hm.countwords("c:\\s.txt"); 
	 
		//Call the comparator 
		Set<String> keys = getWords.keySet();
		for(String Word: keys){
			//if(getWords.get(Word)==1)
			System.out.println(Word+":"+getWords.get(Word));
					}
		System.out.println(getWords.values());
	}

}
