import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import java.util.ArrayList;
import java.util.List;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		long fact = 1;
		
		for(int i=n;i>=1;i--){
			fact = fact *i;
			//n--;
			
		}
		System.out.println(fact);
		
		//Convert Long Int to String
		String str = Long.toString(fact);
		
		//Count the number of trailing Os from String.
		int count =0;
		for(int j =str.length()-1;j>=1;j--)
			if(str.charAt(j) =='0'){
				count++;
			}else{
				break;
			}
		
		System.out.println(count);

		int p = 23;
		System.out.println(Integer.toString(p));
	}

}
