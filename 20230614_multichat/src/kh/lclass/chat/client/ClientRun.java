package kh.lclass.chat.client;

import javax.swing.JOptionPane;

public class ClientRun {

	public static void main(String[] args) {
		String nickName = JOptionPane.showInputDialog("닉네임을 입력해주세요.");
		new ClientGUI(nickName);
		
//		alert() = java기준 경고창 
//		confirm() = yes or no  , 확인 취소 있는 창, return값이 true,false
//		prompt()= 네모박스가 있고 확인창 누르라고 뜨는창 , return값이 void인상태로 끝남
	}

}
