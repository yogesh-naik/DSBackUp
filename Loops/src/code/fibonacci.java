package code;

public class fibonacci {

	/**
	 * Using loops
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int N = 9875;
		
		sumDigit(N);
	}
	
	public static void sumDigit(int N){
		int sum = 0;
		if(N<10)
			System.out.println(N);
		while(N>10){			
			while(N > 1){
				int temp = N%10;
				sum = sum + temp;
				N = N/10;
				if(N<10){
					sum = sum + N;
					break;
				}
			}
			if(sum>9){
				N=sum;
				sum=0;
			}
			
		}
		
		System.out.println(sum);
	}

}
