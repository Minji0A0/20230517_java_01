package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

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

		try {
			InetAddress[] ipAll = InetAddress.getAllByName(host1);
			System.out.println(ipAll);
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
