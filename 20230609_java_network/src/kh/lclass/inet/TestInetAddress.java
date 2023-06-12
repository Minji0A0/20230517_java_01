package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {
		// The constructor InetAddress() is not visible
		// 원인 생성자 없음.
		// 조치내용 : 1. 혹시 singleton인지 확인한다. (주로 getInstance()), create() 라는 메소드로 시작한다.
		// 지원확인)
		// 2. static method 즉 클래스메소드지원이 됨.
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("●●●●●●●●●●●●●●●");
		InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
		System.out.println(loopbackAddress);
		System.out.println("●●●●●●●●●●●●●●●");

		
		
		try {
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp);	//DESKTOP-81FSND6/192.168.10.28
			boolean isLoopback = localIp.isLoopbackAddress();
			System.out.println(isLoopback);
			System.out.println("●●●●●●●locakhost●●●●●●●●");

			InetAddress lb = InetAddress.getByName("localhost");
			System.out.println(Arrays.toString(lb.getAddress()));
			boolean lbIsLoopback = lb.isLoopbackAddress();
			System.out.println(lbIsLoopback);
			System.out.println("●●●●●●●●●●●●●●●");

			
			
			byte[] localIPArr = localIp.getAddress();
			System.out.println("ip : ");
			for (int i = 0; i < localIPArr.length; i++) {
				if (localIPArr[i] < 0) {
					System.out.print(localIPArr[i] + 256);
				} else {
					System.out.print(localIPArr[i]);
				}
				if (i != localIPArr.length - 1) {
					System.out.print(".");
				}
			}
			System.out.println();
			byte[] byteArr = new byte[] {(byte)223,(byte)130,(byte)195,(byte)11}; //int가 아니라 byte처럼 들어갈수있음
//			byte[] byteArr = new byte[] {(223-256),(130-256),(195-256),11}; //int가 아니라 byte처럼 들어갈수있음
			System.out.println(Arrays.toString(byteArr));
			InetAddress byte2Arr = InetAddress.getByAddress(byteArr);
			System.out.println(byte2Arr); // /223.130.195.11
			String byte2Arr2HostName = byte2Arr.getHostName();
			System.out.println(byte2Arr2HostName);
			System.out.println(byte2Arr.getHostAddress());
			
			
			System.out.println("●●●●●●●●●●●●●●●");
			InetAddress[] ipAll = InetAddress.getAllByName(host1);
			System.out.println(ipAll);  //www.naver.com/223.130.200.107
			for (InetAddress ip : ipAll) {
				System.out.println(ip);
				byte[] ipAddr = ip.getAddress();
				System.out.println("ip : ");
				for (int i = 0; i < ipAddr.length; i++) {
					if (ipAddr[i] < 0) {
						System.out.print(ipAddr[i] + 256);
					} else {
						System.out.println(ipAddr[i]);
					}
					if (i != ipAddr.length - 1) {
						System.out.print(".");
					}
				}
				System.out.print(".");
//				}
//				for (int i : ipAddr) {
//					if (i < 0) {
//						System.out.println(i + 256);
//					} else {
//						System.out.println(i);
//					}
//					if(i != ipAddr.length-1 ) {
//					System.out.println(".");
//				}}
//			System.out.println(ipAll.toString());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
