import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class forLoop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		char a[][]= new char[7][7];
//		for (int i =0;i<=6;i++){
//			System.out.println("\n");
//			if((i%2)!=0){
//				System.out.print(" ");
//			}
//			for (int j =0;j<=6;j++){
//				System.out.print(" #");
//			}
//			
//		}
		
	
		/*
		 * Design pattern for 
		  * 4333334
			4322234
			4321234
			4322234
			4333334
			4444444
			
			33333
			32223
			32123
			32223
			33333
			
		 */
		int N=3;
		
		for(int i = 0; i < 2 * N - 1; i++) {
			for(int j = 0; j < 2 * N - 1; j++) {
				System.out.print(1+Math.max(Math.abs(N-i-1), Math.abs(N-j-1)) );
			}
			System.out.println();
		}
		
	/*
	 * String object matching	
	 */
	String s1 = new String("abc");
	String s2 = new String("abc");
	
	if(s1.equals(s2))
		System.out.print("String match");
	else 
		System.out.print("String NOT match");
	}
}
