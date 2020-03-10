import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[] = {'a', 'x', 'y', 'd', 'd','y'};
		countMethod(a);
	}
	
	/*
	 * Method to count each character in Char array
	 * input = char array
	 * output = Print the number of times each character occured
	 */
	public static void countMethod(char[]a){
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		
		for(int i =0;i<=a.length-1;i++){
			if(hp.containsKey(a[i])){
				int temp = hp.get(a[i]);
				temp++;
				hp.put(a[i], temp);
			}else{
				hp.put(a[i],1);
			}
		}
		
		//Print the number of times each character occur
		Set<Character> hs = hp.keySet();
		
		for(Character c:hs){
			System.out.println(c +" "+hp.get(c));
		}
	}

}
