package kh.lclass.exception;

public class UserException extends Throwable{

//	public UserException() {
//		super("유저엑셉션 메세지입니다."); // 아래 msg때문에 출력되지 않음
//	}
	public UserException(String msg) {
		super(msg);
	}
	
}
