
	// TODO Auto-generated method stub
		import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class filewriteDemo {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				try{
					FileWriter flocation = new FileWriter("c:\\s.txt");
					BufferedWriter bw = new BufferedWriter(flocation);
					
					InputStreamReader isr = new InputStreamReader(System.in);
					BufferedReader bsr = new BufferedReader(isr);
					 String line;
					 System.out.println("Enter the line");
					while((line = bsr.readLine()) != null){
						//bw.write("\n");
						bw.write(line);
						//bw.write("\n");						
						
					}bw.close();
					//bsr.close();
					
				}catch(Exception e){
					System.out.println("Exception:"+e);
				}
	}
}
				
				

			

