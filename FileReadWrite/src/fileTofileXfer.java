import java.io.*;


public class fileTofileXfer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		try{
			
			FileReader fread = new FileReader("c:\\s.txt");
			BufferedReader br = new BufferedReader(fread);
			
			FileWriter fwrite = new FileWriter("c:\\d.txt");
			BufferedWriter bw = new BufferedWriter(fwrite);
			
			//InputStreamReader isr = new InputStreamReader(System.in);
			String line;
			System.out.println("Xfer started");
			while((line = br.readLine()) != null){
				//bw.write("\n");
				bw.write(line);
				
				
			}bw.close();
			br.close();
			System.out.println("Xfer completed");
		}catch(Exception e){
			System.out.println("Exception:"+e);
		}
		

	}

}
