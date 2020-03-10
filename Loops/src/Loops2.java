
public class Loops2 {

	/**
	 *   # # # # 
	 *     # # #
	 *       # #
	 *         #	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i = 4 ;i>=0;i--){
//			for(int k=(4-i);k>=1;k--){
//				System.out.print(" ");
//			}
//			for(int j =i;j>=0;j--){
//				System.out.print("*");
//			}
//			System.out.println("\n");
		
		for(int i = 4 ;i>=0;i--){
			for(int k=1;k<=(4-i);k++){
				System.out.print(" ");
			}
			for(int j =i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println("\n");
		}	
	}

}
