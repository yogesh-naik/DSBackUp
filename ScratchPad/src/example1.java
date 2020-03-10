import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number");
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		
		int p = Integer.parseInt(a.readLine());
		
		if(p<0 || p>99){
			System.out.println("The number is wrong.please enter +ve number");
		}else if(p>50){
			System.out.println("PASS");
		}
			else {
				System.out.println("FAIL");
			}

		}


}
