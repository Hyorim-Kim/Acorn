import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetTest3Server {   // Echo server
	ServerSocket ss = null;
	Socket socket;
	PrintWriter out;
	BufferedReader reader;
	
	
	public NetTest3Server() {
		try {
			ss = new ServerSocket(5000);
		} catch (Exception e) {
			System.out.println("NetTest3Server err : " + e);
			return;
		}
		System.out.println("서버 서비스 중 ...");
		
		try {
			socket = ss.accept();
			out = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"EUC-KR"));
		} catch (Exception e) {
			System.out.println("에러 : " + e);
			return;
		}
	}
	
	
	public void receiveMsg() {   // client가 전송한 자료를 수신해서 출력
		try {
			String msg = reader.readLine();
			System.out.println("receive msg : " + msg);
			
			out.println("from server : " + msg + " good");
			
			reader.close();
			out.close();
			socket.close();
			ss.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			NetTest3Server server = new NetTest3Server();
			server.receiveMsg();
		}
	}	
}	