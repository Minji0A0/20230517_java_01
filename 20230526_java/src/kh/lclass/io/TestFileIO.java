package kh.lclass.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIO {
	public void testFile() /* throws Exception */ {
//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdirs();
		String path = "D:/data2/test";
		String filename = "aaa.txt";
		new File(path).mkdirs(); // mkdirs 디렉토리 생성
		File f2 = new File(path, filename);
		
//		File f1 = new File("D:/data2/test");
//		f1.mkdirs();
//		File f2 = new File("D:/data2/test/aaa.txt");
//		Unhandled exception type IOException
		FileWriter fw = null;
		try {
			f2.createNewFile();	// 파일생성
			
			fw = new FileWriter(f2);
			fw.write("abcdefg");
			fw.flush();
			return; // finally는 return 조차 한번 들렸다가 해결하고 밖으로 나감
						
		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally {
		try {
			if(fw != null ) {fw.close();} // 개발자들이 흔하게 이렇게 많이 한줄코딩 씀
		} catch (IOException e) {
			e.printStackTrace();
		}  // try catch 밖에 선언하고 종료 시킴
	}
	}
}
