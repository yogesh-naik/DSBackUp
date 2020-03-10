import java.util.ArrayList;
import java.util.Iterator;


public class BinaryToDecimal {

	private static final String P = null;




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>a = new ArrayList<Integer>();
		
		//ArrayList<String> myList = new ArrayList<String>();
		
		int N = 14;
		int i=0;
		while(N>0){
			a.add(i,N%2);
			N=N/2;
		}

		Iterator<Integer> itr = a.iterator();
        while(itr.hasNext()){
           // if(removeElem.equals(itr.next())){
        	 System.out.print(itr.next());
        }
        int N1= 455;int sum = 0;
        int p  = recur(N1,sum);
        System.out.println("Print"+P);
	
			
	}//End of main		
	
	  
   	
   	
   	static int recur(int N1,int sum){
   		int p = N1%10;
   		sum = sum +p;
   		  N1 = recur(N1/10, sum);
   		  return sum;
   	}
   //	 System.out.print("Enter the N"+sum);
//	}

	
}
