package kh.lclass.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TestSwing extends JFrame {
	public TestSwing() {
		setTitle("Hello Window 프레임"); // 고정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 고정// x버튼 눌러서 resource 정리하고 창 닫기

		Container contentPane = getContentPane();
//		contentPane.setLayout(new BorderLayout(20,30));
//		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
//		contentPane.setLayout(new BorderLayout());
//		
//		contentPane.add(new JButton("OK"),BorderLayout.NORTH);
//		contentPane.add(new JButton("Cancle"),BorderLayout.WEST);
//		contentPane.add(new JButton("Ignore"),BorderLayout.EAST);
//		contentPane.add(new JButton("Ignore"),BorderLayout.CENTER);

//		contentPane.setLayout(new GridLayout(3,4,10,10));
//		contentPane.add(new JButton("1"));
//		contentPane.add(new JButton("2"));
//		contentPane.add(new JButton("3"));

//		component 생성
		contentPane.setLayout(new GridLayout(5, 2, 10, 10));
		JTextField txtName = new JTextField();
		JTextField txtno = new JTextField();
		JTextField txtMajor = new JTextField();
		JTextField txtSubject = new JTextField();
		JButton btnSave = new JButton("저장");

//		event 등록 = Action 리스너 달기
		btnSave.addActionListener(new MyActionListener());
		txtName.addActionListener(new MyActionListener());

//		component를 contentPane에 추가 
		contentPane.add(new JLabel("이름"));
		contentPane.add(txtName);
		contentPane.add(new JLabel("학번"));
		contentPane.add(txtno);
		contentPane.add(new JLabel("학과"));
		contentPane.add(txtMajor);
		contentPane.add(new JLabel("과목"));
		contentPane.add(txtSubject);

		contentPane.add(btnSave);

		setSize(300, 300);// 고정
		setVisible(true);// 고정
	}

	public static void main(String[] args) {
		TestSwing frame = new TestSwing();

	}

}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("이건 언제 호출되지???");
		System.out.println(e);
		Object source = e.getSource();
		if (source instanceof JButton) {
			System.out.println("button 눌렀는데요");
			if(((JButton) source).getText().equals("저장")) {
			((JButton) source).setText("Save");
			}else {
				((JButton) source).setText("저장");
			}
//			((JButton) source).setText("Save");
		} else if (source instanceof JTextField) {
			System.out.println("text 필드에서 enter key를 눌렀네요.");

		}
	}
}