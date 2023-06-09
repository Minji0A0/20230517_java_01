package kh.lclass.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public void testTcpSerber(int port) {
		ServerSocket ss = null;
		try {
			// 2 . 서버용 소켓 객체 생성
			ss = new ServerSocket(port);

			// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4. 접속 요청이 오면 요청 수락후 해당 클라이언트에 대한 소켓 객체 생성
			Socket sc = ss.accept();

			// 5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream in = sc.getInputStream();
			OutputStream out = sc.getOutputStream();
			
			//6. 보조 스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(out));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Resource leak : '<unassigned Closeable value>' is never closed
				if (ss != null)
					ss.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
