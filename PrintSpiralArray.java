
public class PrintSpiralArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		int a[][] = new int [4][4];
		
		for (int i = 0; i < a.length ; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < a[i].length ; j++) {
					System.out.print(a[i][j] + ", ");
				}
			} else {
				for (j = a[i].length -1 ; j >= 0; j--) {
					System.out.print(a[i][j] + ", ");
				}
			}
		}
	}
}
