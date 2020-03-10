import java.util.HashSet;
import java.util.Set;


public class scratchPad implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(less(-2,-2));
		
		int a[] = {1,1,2,3,4,4,4,5,5};
		Count(a,0,a.length-1,4);
		
		
		int ap[] = {0,2,3,4,6,10};
		Location(ap,0,ap.length-1);
		
		int at[] = {4,-5,-2,12,14,-5,9};
		
		Set<Integer> hs  = new HashSet<Integer>();
		for(int i=0;i<at.length-1;i++){
			if(hs.add(at[i])==false){
				System.out.println("Repeated no--"+at[i]);
				break;
			}
			else{
				hs.add(a[i]);
			}
		}
	}

	 private static boolean less(Integer a, Integer j) {
         return a.compareTo(j) <0;
     }
	 
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return this.compareTo(o);
		}
		
		public static void Count(int a[],int low,int high,int data){
			if(a[high] == data){
				System.out.println("No of times- "+high);
			}
			else if(low<high){
				int mid = low + (high - low)/2;
				if((a[mid] == data && a[mid+1] >data))
					System.out.println("No of times- "+mid);
				else if(a[mid] <=data)
					Count(a,mid+1,high,data);
				else
					Count(a,low,mid-1,data);								
			}			
		}
		
		public static void Location(int a[],int low,int high){
			int mid = low + (high - low)/2;
			if(a[mid] !=mid && mid ==0)
				return;
			if(a[mid] !=mid && mid == high)
				return;
			if(a[mid] == mid)
					System.out.println(mid);
				else{
					Location(a,low,mid-1);
					Location(a,mid+1,high);
				}
		}

		
}


