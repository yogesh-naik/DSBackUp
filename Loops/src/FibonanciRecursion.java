
public class FibonanciRecursion {

	/*
	 * Fibonanci series with recursion.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j =1;
		
		System.out.println(i);
		System.out.println(j);
		int num =10;
		Fibonanci(i,j);

	}
	
	public static void Fibonanci(int i ,int j){
		
		if(j<50){
			int sum = i+j;
			i = j;
			j = sum;
					
			System.out.println("sum"+sum);
			Fibonanci(i ,j);
		}
		
	}

}
