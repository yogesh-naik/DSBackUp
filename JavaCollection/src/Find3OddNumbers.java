import java.util.HashMap;


public class Find3OddNumbers {

	/**
	 * GOOGLE interview questions
	 * You have an array of integers(size N), such that each integer 
	 * is present an odd number of time, except 3 of them(which are 
	 * present even number of times). Find the three numbers. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,6,4,1,4,5,8,8,4,6,8,99,8,9,7,9,5,9} ;
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		//Using hashmap ,finding each number occurs how many times.
		for(int i=0;i<=a.length-1;i++){
			if(!(hp.containsKey(a[i]))){
				hp.put(a[i],1);
			}
			else{
				hp.put(a[i],hp.get(a[i])+1);
			}
		}
		
		
		System.out.println(hp.toString());
		//Checking if occurance is even then print the number.
		for(Integer key : hp.keySet()){
			Integer oucrrance = hp.get(key);
			if(oucrrance%2 ==0)
				System.out.println("The values "+ key);
		}
		

	}

}
