

public class ListAdd {

	public static void main(String[] args) {
		/*
		 *    AAAAA
		 *     AAAA
		 *      AAA
		 *       AA
		 *        A
		 */
/*		
		int k=0;
		int p = 0;
	for(int i=5;i>=1;i=i-1){
		while(k>0){
			System.out.print(" ");
			k--;
		}
		p++;
		for(int j=i;j>=1;j--){	
			//for(int k=1;k>1;k--)
				
				System.out.print("A");			
		}k=p;
		System.out.println();
		
	} */
		
		/*
		 *   BBBBB
		 *    BBB
		 *     B
		 */
		
		int k = 0,counter=0;
		for(int i=5;i>=1;i=i-2){
			while(k>0){
				System.out.print(" ");
				k--;
			}
			counter++;
			for(int j=1;j<=i;j++){
				System.out.print("B");
			}
			k=counter;
			System.out.println();
		}

	}

}
