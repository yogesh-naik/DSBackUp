/*
 * Cracking Coding interview  1.7
 * For 2D array if element is 0 then make ALL that column and row =0
 * 
 */
public class ZeroArray {

	static int arr[][] = { 
							{ 1, 2, 3, 4, 5, 6 }, 
							{ 7, 8, 9, 0, 11,12 }, 
							{ 13,14,15,16,17, 18 } 
						};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = arr.length;
		int tr = 0;
		int tc = 0;
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				if (arr[i][j] == 0) {
					tr = i;  //take row
					tc = j;  // column
				}
			}
		}// end of for loop
		
		for(int i=0;i<=row-1;i++){
			arr[i][tc] =0;
		}
		
		for(int i=0;i<=arr[0].length - 1;i++){
			arr[tr][i] =0;
		}
		
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= arr[j].length - 1; j++) {
				System.out.print(arr[i][j]+ " ");	
			}
			System.out.println();
		}
	}

}
