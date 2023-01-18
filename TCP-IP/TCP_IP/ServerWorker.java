package TCP_IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerWorker extends Thread {
	
	private final Socket clientSocket;
	
	public ServerWorker(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}//end ServerWorker
	 @Override
	 public void run() {
		 try {
			handleClientSocket();
		}//end try
		 catch (IOException e) {
			 e.printStackTrace();
		}//end catch
		 catch(InterruptedException e) {
			 e.printStackTrace();
		}//end catch
	 }//end run
	 
	private void handleClientSocket() throws IOException, InterruptedException {
		InputStream inputStream = clientSocket.getInputStream();
		OutputStream outputStream = clientSocket.getOutputStream();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		while((line = reader.readLine()) !=null) {
			if("*end*".equalsIgnoreCase(line)) {
				break;
			}//end if
			String msg = "Deine Antwort war: " + line + "\n";
			outputStream.write(msg.getBytes());
		}//end while
		clientSocket.close();
	}
}
