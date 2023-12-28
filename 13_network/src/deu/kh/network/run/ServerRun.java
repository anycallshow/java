package deu.kh.network.run;

import deu.kh.network.model.service.TCPServer;

public class ServerRun {

	public static void main(String[] args) {
		TCPServer server = new TCPServer();
		
		server.serverStart();
		
	}

}
