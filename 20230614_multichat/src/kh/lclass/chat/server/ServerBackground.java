package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kh.lclass.chat.client.ClientGUI;

public class ServerBackground {
	private ServerSocket ss; // 서버소켓
	private ServerGUI gui; // null //=new 하면 안됨.

//	client 여러명을 관리 : key : nickname , value : OutputStream
	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
//	map.put("socket", socket);
//	map.put("nickname", "ej");
//	mapList.add(map);

//	map.put("ej", socket);
//	map.put("hj", socket);

//	private List<String> nickname;
	private Socket socket;
//	private BufferedReader br;
//	private BufferedWriter bw;

//	private Socket socket; // 필드는 따로 close 안해줘도됨.
//	private String nickname;

	private int count; // 현재 접속자 수

	// 서버 생성 및 설정 -- 클라이언트의 커넥션과 동일 역활 setting
	public void setting() {
		//참고용 : 동시접속자로 map에 정보가 
		Collections.synchronizedMap(mapClients);
		
		try {
//			serverSocket = new ServerSocket(7777);
			ss = new ServerSocket(7777);

//		방문자 접속을 계속 받아들임, 무한반복함. GUI 프로그램 경우 창 닫힐때까지 계속 반복됨. break가 없음.
			while (true) {
				// 접속자 대기 중
				socket = ss.accept(); // 클라이언트 받음
				new Client(socket).start();
//				Client client = new Client(socket);
//				client.start();

				// 클라이언트 nickname에 바로 이어서 들어옴.
//				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

//				String nickName = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	클라이언트 접속하면 그 정보를 나타내 주는 메소드
	public void addclient(String nickName) {
		gui.appendMsg(nickName + "님이 접속했습니다.");
	}

//	private ClientGUI gui
	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}

	public void sendMessage(String msg) {
		// client들 모두에게 msg 전달
		Set<String> keys = mapClients.keySet();
		for (String key : keys) {
			BufferedWriter wr = mapClients.get(key);
			try {
				wr.write(key +" : " +msg+"");
				wr.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
////////////// Inner Class ///////////////	

	class Client extends Thread { // thread를 사용할떄는 꼭 오버라이드를 사용해야한다.
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickName;

		public Client(Socket socket) {
			// 초기값 설정
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//client nickname이 바로 이어서 들어옴
				//접속되면 바로 nickname이 전달될 것이므로 읽음		
				String nickName = br.readLine();
				// server 화면에 표현
				addclient(nickName);
				// client outputStream 관리 map에 추가
				mapClients.put(nickName, bw);
				//client map 모두에게 접속 정보 전달
				sendMessage(nickName+"님 접속했습니다.\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			// 클라이언트마다 각각에서 전달되어오는 메시지 확인하고 화면에 출력
			// client와 입력 통로가 끊어지지 않았다면 계속 반복확인함.
			// client에서 수신받은 msg
			while (br != null) {
//				String msg = null;
				try {
					String msg = br.readLine();
//					msg = br.readLine();
					gui.appendMsg(msg);
					sendMessage(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

	}
}