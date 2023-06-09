package kh.lclass.thread.run;

import kh.lclass.thread.ThreadAaa;
import kh.lclass.thread.ThreadBbb;

public class Run {
	public static void main(String[] args) {

//		Runnable ra = new ThreadAaa();
//		Thread ta = new Thread(ra);
		
//		new Thread(ta).start();
		
		Thread ta = new Thread(new ThreadAaa());
		ta.setPriority(1);
		ta.start();
		
		ThreadBbb tb = new ThreadBbb();
		ta.setPriority(10);
		tb.start();	// run이 아니라 start이다. start를 사용하면 run이랑 같이 번갈아가면서 조금씩 작동할수있다.
//		run 일반 메소드 호출하듯 하면 Thred 동작 안함
//		ta.run();
//		tb.run();

		ThreadBbb tbb = new ThreadBbb();
		tbb.start();	
		
		for (int i = 0; i < 500; i++) {
			System.out.println(i + "+");
		}

		System.out.println("******** 끝 **********");
	}
}