package kh.lclass.vo;

import java.io.File;

public class TestVo {
	
	private int boardNum;
	private String	boardWriter;
	private String	boardTitle;
	private String	boardContent;
	private String	boardDate;
	
//	생성자
	public TestVo(int num) {
		boardNum = num ;
		boardNum = (int)System.currentTimeMillis() +num;
	}
	
//	all arguments 생성자 == 초기값 설정
	public TestVo(int a, String writer) {
//		boardNum = a;
		this(a);		//	boardNum = num ; 호출
		boardWriter = writer;
	}
	public TestVo(int boardNum, String boardWriter, String boardTitle, String boardContent, String boardDate) {
	this(boardNum, boardWriter);
//	this.boardWriter = boardWriter;
	this.boardContent = boardContent;
	this.boardDate = boardDate;
	}
	
//	getter
	public int getboardNum() {
		return boardNum;
	}
	public String getboardWriter() {
		return boardWriter;
	}
	public String getboardTitle() {
		return boardTitle;
	}
	public String getboardContent() {
		return boardContent;
	}
	public String getboardDate() {
		return boardDate;
	}	
//	setter
	public void setboardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setboardWriter(String boardWriter) {
		this.boardWriter = getboardWriter();
	}
	public void setboardTitle(String boardTitle) {
		this.boardTitle = getboardTitle();
	}
	public void setboardContent(String boardContent) {
		this.boardContent = getboardContent();
	}
	public void setboardDate(String boardDate) {
		this.boardDate = getboardDate();
	}

		
//	toString
	
	@Override
	public String toString() {
		return "TestVo [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + "]";
	}
	
	
	
}
