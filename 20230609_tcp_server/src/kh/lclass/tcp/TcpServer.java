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
		//1. 서버의 포트번호 정황 == > 프로그램의 포트번호
		ServerSocket ss = null;
		Socket sc = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		BufferedWriter wr = null;
		
		
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

			wr.write("반갑습니다.");
			wr.flush();
			
			String receivedMsg = br.readLine();
			System.out.println("받은메세지 : "+ receivedMsg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Resource leak : '<unassigned Closeable value>' is never closed
				if (wr != null) wr.close();
				if (br != null) br.close();
				if (out != null) out.close();
				if (in != null) in.close();
				if (sc != null) sc.close();
				if (ss != null) ss.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
