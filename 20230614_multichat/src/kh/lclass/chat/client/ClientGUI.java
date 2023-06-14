package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 6521300218799647804L;

	private JTextArea jta = new JTextArea(40, 25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분

	private String nickName; // 클라이언트 닉네임
	private ClientBackground cb = new ClientBackground(); // 채팅 socket기능을 담당할 객체를 만들어준다.

	public ClientGUI(String nickname) {
		this.nickName = nickname;

		// 생성자에서는 초기화 (즉 화면 초기화)
		setBounds(200, 100, 400, 600); // 창이 뜨는 위치와 크기
		setTitle(nickname + "님 창");

		jta.setEditable(false); // 채팅창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기
		jta.setBackground(new Color(255, 255, 200));

		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 모든 언어에서 고정 꼭 외워야함
		setVisible(true); // 모든 언어에서 고정 꼭 외워야함

		cb.setNickname(nickname);
		cb.setGui(this);
		cb.connection();
	}

	// TODO 새 메시지를 받았을때 메소드 호출됨.
	public void appendMsg(String msg) {
		// jta (채팅장)에 msg를 추가함.
		jta.append(msg);
		jta.append("\n");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = jtf.getText();
		System.out.println(msg);
		jtf.setText("");
		// server에 전달하기 위해 background에 전달
		cb.sendMessage(msg);
	}
}
