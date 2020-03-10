
public class Replace_0_Row_col {

	/**
	 * In given array find zero and replace the entire row and column 
	 * with zeros
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = new int[][]{
				{1,2,3,4},
				{5,6,7,8},
				{9,10,0,12},
				{11,2,15,16}
		};
		
		for(int i=0;i<=A.length-1;i++){
			for(int j=0;j<=A[i].length-1;j++){
				if(A[i][j] ==0){
					ReplaceNumwith_0(A,i,j);	
					break;
				}
			}
		}
	}//End of Main

	public static void ReplaceNumwith_0(int arr[][],int row,int col){
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
					arr[row][j]=0;
					arr[i][col]=0;
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
