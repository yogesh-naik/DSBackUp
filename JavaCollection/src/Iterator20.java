
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iterator20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num [] = {23,4,56,6,1,-3};
	    boolean flag;
	     
	    do {
	             flag= false;    //set flag to false awaiting a possible swap
	             for(int j=0;  j < num.length -1;  j++ )
	             {
	                    if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                    {
	                           int  temp = num[ j ];                //swap elements
	                            num[ j ] = num[ j+1 ];
	                            num[ j+1 ] = temp;
	                           flag = true;              //shows a swap occurred  
	                   } 
	                    
	             } 
	             	          
	       }  while ( flag );
	      for(int i =0;i<num.length;i++){
	    	  System.out.println(num[i]);
	      }
//		       	String removeElem = "Perl";
//		       	ArrayList<String> myList = new ArrayList<String>();
//		        myList.add("Java");
//		        myList.add("Unix");
//		        myList.add("Oracle");
//		        myList.add("C++");
//		        myList.add("Perl");
//		        System.out.println("Before remove:");
//		        System.out.println(myList);
//		        
//		        Iterator<String> itr = myList.listIterator();
//		        while(itr.hasNext()){
//		           // if(removeElem.equals(itr.next())){
//		        	if(itr.next() == "C++"){
//		                itr.remove();
//		            }
//		        }
//		        System.out.println("After remove:");
//		        System.out.println(myList);
//		        
//		        //Copying the List into Arryalist
//		        Object copy = new ArrayList<String>();
//		        copy =  myList.clone();
//		        System.out.println("After cloning ArryaList");
//		        System.out.println(copy);
//		        
//		      //  Iterator<String> itr = myList.iterator();
//		        
//		        String  a = "hello";
//		        int l = a.length();
//		        String rev ="";
//		        
//		        for(int i = l-1;i>=0;i--){
//		        	rev = rev + a.charAt(i);
//		        }
//		        System.out.println(rev);
//		        
//		        Set <String> a1 = new HashSet<String>();
//		        a1.add("Java");
//		        a1.add("PE");
//		        
//		        Iterator<String> itr1 = a1.iterator();
//		      while(itr1.hasNext()){
//		        	System.out.println(itr1.next());
//		    }
		  
	}

}
