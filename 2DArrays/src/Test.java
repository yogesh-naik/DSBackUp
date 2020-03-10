
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p[][] = new int[2][2];
		int s = 1;
		for(int i=0;i<=1;i++){
			for(int j=0;j<=1;j++){
				p[i][j] = s++;
			}
		}
//print
		for(int i=0;i<=1;i++){
			for(int j=0;j<=1;j++){
				System.out.print(" "+p[i][j]);
			}
			System.out.println();
		}
	}

}
