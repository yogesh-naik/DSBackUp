
public class mergeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = { 1, 2, 8, 10, 19, 22, 28, 30 } ; 
		int b [] = { 1, 2, 3, 7, 11, 18, 25, 40, 45, 50 } ;
		
		int lenA = a.length;
			System.out.println(lenA);
		int lenB = b.length;
			System.out.println(lenB);
		
		int c[] = new int[lenA+lenB];
			System.out.println(c.length);
		int i=0,j=0;
		
		for(int k=0;k<=c.length-1;){
			if(a[i]<=b[j] && i<=(lenA-1) && j<=(lenB-1)){
				c[k] = a[i];
				k++;i++;
			}
			else{
				c[k]=b[j];
				k++;j++;
			}
			if(i==lenA-1 && j<=lenB-1){
				c[k] = b[j];
				k++;j++;
			}
			if(j==lenB-1 && i<=lenA-1){
				c[k] = a[i];
				k++;i++;
			}
			
		}
		
		for(int p=0;p<=c.length-1;p++){
			System.out.println("Array  "+c[p]);
		}
	}

}
