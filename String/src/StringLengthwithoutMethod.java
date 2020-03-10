import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StringLengthwithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is";
		//str = str.en
		String s = "Yogesh";
		int i=0;
		try{	
			while(s.charAt(i) != '\0')
			{
				//s.charAt(i);
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("the length is " + i);
		}
	
					
	}
}