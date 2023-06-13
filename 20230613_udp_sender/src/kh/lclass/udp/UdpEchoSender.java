package kh.lclass.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpEchoSender {
	public static void main(String[] args) {
		new UdpEchoSender().senderUdp();
	}

	public void senderUdp() {
		// 포트번호 정함
		int myPort = 5001;
		int destPort = 6001;
		String destName = "localhost";
		
		DatagramSocket dSock = null;
		try {
			// DatatgranSocket 객체 생성
			new DatagramSocket(myPort);// 매개인자 없으면 자동 port 번호 할당. 지정하면 해당 포트번호로 소켓 생성
		
			//전달할 메시지
			String sendMsg = "안녕";
			
			//메시지 전달
//			3. 연결할 클라이언트 IP주소를 가진 InetAddress 객체 생성
			InetAddress destIp = InetAddress.getByName(destName);
//			4. 전송할 메시지를 byte[]로 바꿈 
			byte[] byteMst = sendMsg.getBytes();
//			5. 전송할 메시지를 DatagramaPacket 객체에 담음
			new DatagramPacket(byteMst, byteMst.length, null, destPort);
		
		} catch (SocketException e) {
			e.printStackTrace();
		} finally {
			if (dSock != null) dSock.close();
		}

	}
}
