package kh.lclass.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import kh.lclass.chat.client.ClientBackground;

public class ServerGUI extends JFrame implements ActionListener{
	// 컴파일시 인식할 ServerGUI으로 만들어진 객체 고유 ID

	private static final long serialVersionUID = 6085316166659427339L;

	private JTextArea jta = new JTextArea(40, 25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분

	private ServerBackground sb = new ServerBackground(); // 채팅 socket기능을 담당할 객체를 만들어준다.
	
	public ServerGUI() {
		// 생성자에서는 초기화(즉 화면 초기화)
		setBounds(200, 100, 400, 600); //창이 뜨는 위치와 크기
		setTitle("서버창");
		
		jta.setEditable(false); // 채팅창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기
		jta.setBackground(new Color(230, 255, 230));
		
//		setLayout(new BorderLayout()); // 기본적으로 생성되므로 일부러 작성하지는 않는다.
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		sb.setGui(this);
		sb.setting();
	}
	// TODO 새 메시지를 받았을때 메소드 호출됨.
	public void appendMsg(String msg) {
		//jta (채팅장)에 msg를 추가함.
		jta.append(msg);
		jta.append("\n");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		입력창에 글 입력 enter key를 눌렀을때 
		String msg = jtf.getText();
		System.out.println(msg);
		jtf.setText(""); //입력창 입력된 글을 초기화 // 엔터를 누르면 입력창의 글이 지워짐
		//TODO server에 전달하기 위해 background에 전달
				
	}
}