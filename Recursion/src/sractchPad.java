import java.util.Arrays;


public class sractchPad {

static 	int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Number is "+increment(5));
//		
//		int a[] = {1,2,4};
//		Arrays.toString(a);
//		
//		for(int i=0;i<=a.length-1;i++)
//			System.out.println("--"+a[i]);
//		get(6);
//		System.out.println(count);
		
		print(1000);
		
	}
	
//	public static int increment(int p){
//		if(p<10){
//			p++;			
//			System.out.println(p);
//			//p=11;
//			return increment(p);
//		}		
//			return p;		
//	}
	
	static int get (int n)
	{
		
		
	    if (n != 1)
	    	count = count + get(n-1);
	    
	    return count;
	    //System.out.println("HERE "+ count);
//	    get(n-1);
//	    get(n-3);	    
	   
	}
	
	static void print(int n)
	{
	    if (n >= 4000)
	        return;
	    System.out.println(n);
	    print(2*n);
	    System.out.println(n);
	}
	
}
