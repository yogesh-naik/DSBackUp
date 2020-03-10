package mychatApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MessageListner extends Thread{
	
	ServerSocket server;
	int port =8877;
	WritableGUI gui;
	
	public MessageListner(WritableGUI gui,int port) throws IOException{	
		this.port = port;
		this.gui = gui;
		server = new ServerSocket(port);
	}
	
	public MessageListner(){	
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run(){
		Socket clientSocket;
		
		try {
			while((clientSocket = server.accept()) != null){
				InputStream is = clientSocket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String line = br.readLine();
				if(line !=null){
					gui.write(line);
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
