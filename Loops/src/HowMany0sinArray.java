
public class HowMany0sinArray {

	/**
	 * How many 0s are present in an sorted array of 0s and 1s
	 * Using Recursive method
	 */
	static int counter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter =0;
		int a[] = {0,0,0,0,0,0,0,0,0,1,1,1,1,};		
		count(counter,a);
		
	}
	
	public static void count(int counter,int a[]){
		
		if(a[counter] !=1){
			counter++;
			count(counter,a);			
		}
		else 
			System.out.println("How many 0s present = "+counter);		
	}

}
