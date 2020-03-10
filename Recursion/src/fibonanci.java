
public class fibonanci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;		
			//System.out.println(fibo(n));
			
		//System.out.println(sum(5));	
		
		String str = "abc";
		for(int i=0;i<=str.length()-1;i++){
			for(int j=0;j<=i;j++){
				System.out.println(str.substring(j,i+1));
			}
		}
			
	}
	
	public static int fibo(int n){
		//int sum = 1;		
	       while(n>=1)
	    	   return  fibo(n-1)*n;
//	       else
	    	   return 1;
	        //result;		
	}

	public static int sum(int n){
		
		if(n==1)
			return 1;
		else{
			return sum(n-1) + n;
		}
	}
}
