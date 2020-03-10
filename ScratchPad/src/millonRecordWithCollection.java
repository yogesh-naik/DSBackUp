import java.util.ArrayList;

/*
There are 2 arraylists each consisting of 1 million records. 
Give me the same objects present in both the lists. 
The objects in the list can be any thing of our choice

*/
public class millonRecordWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> Arr1 = new ArrayList<Object>();
		Arr1.add("A"); 
		Arr1.add("B"); 
		Arr1.add("C"); 
		Arr1.add("D"); 

		ArrayList<Object> Arr2 = new ArrayList<Object>(); 
		Arr2.add("A"); 
		Arr2.add("B"); 
		Arr2.add("C"); 
		Arr2.add("E"); 

		Arr1.retainAll(Arr2); 

		for (Object str : Arr1) { 
		System.out.println(str); 
		} ///

	}

}
