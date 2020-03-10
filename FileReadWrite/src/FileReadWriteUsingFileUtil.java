import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class FileReadWriteUsingFileUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuffer sb =null;
		String given = " This is your day";
		String output;
	
		
		;
		for(int i=given.length()-1;i>=0;){
			int counter =0;int j=i;
			while (given.substring(j) != " "){
				counter++;j--;	
				System.out.println("Exception:"+given.substring(j));
				
			}
			String substring = given.substring(j+1,j+counter);
			sb = sb.append(substring);
				counter=0;i=j;
				System.out.println("Exception2"+given.substring(j));
			
			i--;
				
		}
		//System.out.println("Exception:"+sb.toString());
	}
		

	

}
