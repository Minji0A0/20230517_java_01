package kh.lclass.oop.sample;

import java.awt.im.spi.InputMethod;
import java.io.Serializable;

//public abstract class TestInterface{
//	public abstract void method1();				// 능력 단위별 평가보기
//	public abstract String method2();			// 평가안내
//	public abstract int method3 (int a, int b);	// 평가리뷰
//} 전부다 abstract가 붙어있는 메소드들

public interface TestInterface extends/* InputMethod,*/ Serializable {
	public final int MAXCNT = 10;
	public void method1();				// 능력 단위별 평가보기
	public String method2();			// 평가안내
	public int method3 (int a, int b);	// 평가리뷰
	public int method3 ();	// 평가리뷰
	
//	int insertBoard(Car vo); //CRUD + selet + List
//	int deleteBoard(Car vo);
//	int updateBoard(Car vo);
//	Car selectOne(int boardNo);
//	Car[] selectList();
//	Car[] selectList(String serchWord);
//	List<Car> selectListList(String serchWord); // 오버로딩 안됨
//	Car[] searchSelectBorard(String word);	
}


