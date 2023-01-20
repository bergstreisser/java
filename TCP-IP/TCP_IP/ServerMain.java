package TCP_IP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		int port = 12004;
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			while(true) {
				System.out.println("Erwarte Client Antwort...");
				Socket clientSocket = serverSocket.accept();
				System.out.println("Verbindung angenommen" + clientSocket);
				ServerWorker worker = new ServerWorker(clientSocket);
				worker.start();
			}//end while
		}//end try
		catch(IOException e) {
			e.printStackTrace();
		}//end catch
	}//end main
}//end ServerMain

