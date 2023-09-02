import java.io.PrintWriter;
import java.net.Socket;

public class NetTest2Client {

	public static void main(String[] args) {
		// client
		try {
			Socket socket = new Socket("192.168.0.59", 7777);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Hi I'm hrk" + "\n");   // 서버로 데이터 전송
			out.close();
			socket.close();
		} catch (Exception e) {
			System.out.println("client err : " + e);
		}

	}

}
