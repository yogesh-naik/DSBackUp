import java.io.IOException;

public class Loops {

	public static void main(String[] args) throws IOException {
		
		int x =7;
		for(int i=1;i<=x;i++){
			if(i%2 !=0){
				for(int j=1;j<=x/2;j++)
					System.out.print("*");
					System.out.print(" ");
				for(int k=1;k<=x;k++)
					System.out.print("*");
			}
			if(i%2==0){
				for(int l=1;l<=x;l++)
					System.out.print("*");
					System.out.print(" ");
				for(int j=1;j<=x/2;j++)
					System.out.print("*");
				}
			
			System.out.println();
			//System.out.println("Hello World");
		}
		
	}
}
