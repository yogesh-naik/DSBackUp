import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class reverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> myList = new LinkedList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        
        Collections.reverse(myList); 
        for(String i: myList){ 
        	System.out.println(i);	
        } 

        int arr[] = {5,4,3,2,1};
        String s = Arrays.toString(arr);
        System.out.println(s);
    	StringBuffer sbf = new StringBuffer();
    	
    	for(int i=arr.length-1;i>=0;i--){
    		char p = s.charAt(s.length()-1);
    		sbf=sbf.append(p);
    		sbf=sbf.append(s.substring(0, arr.length-1));
    		System.out.println(sbf);
    	}
    	    	
	}
	
}
