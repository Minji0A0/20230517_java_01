package kh.lclass.swing;

import javax.swing.JFrame;

public class TestSwing extends JFrame {
	public TestSwing() {
		setTitle("Hello Window 프레임");  // 고정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 고정// x버튼 눌러서 resource 정리하고 창 닫기
		
		
		setSize(300, 300);// 고정
		setVisible(true);// 고정
	}
	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
		
	}
}
