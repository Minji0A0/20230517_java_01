package kh.lclass.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.Buffer;

import kh.lclass.exception.UserException;

public class TestFileIO {


	public void testFileOutputStreamObject() {
		String filePath = "D:/data2/test/aaa.txt";
		FileInputStream ios = null; // 기반스트림
		ObjectInputStream ois = null; // 보조스트림
		// 파일에 사람들 자료를 저장함.
		Person p1 = new Person("홍길동", 23, '남');
		Person p2 = new Person("홍영희", 27, 'F');
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void testFileInputStreamObject() {
		String filePath = "D:/data2/test/aaa.txt";
		FileInputStream ios = null; // 기반스트림
		ObjectInputStream ois = null; // 보조스트림
		try {
			ios = new FileInputStream(filePath);
			ois = new ObjectInputStream(ios);
			Object a = null;
			if((a = ois.readObject()) instanceof Person) {
				Person p = (Person)a;
				System.out.println(p);
			}
			if((a=ois.readObject()) instanceof Person) {
			Person p = (Person)a;
			System.out.println(a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (ios != null)
					ios.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void testRamda() throws UserException {
		int[] arr = { 2, 3, 4 };
		int[] arr2 = new int[] { 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (arr.length > 2) {
//			No exception of type UserException can be thrown; an exception type must be a subclass of Throwable
			throw new UserException("배열의 크기는 2보다 크면 안됨. 줄여주세요.");
			// 오류발생하고 죽어버림
		}
	}

	public void testFileReaddata() {
		String filePath = "D:/data2/test/aaa.txt";
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath));) {
			long temp = 0L;
			while ((dis.readLong()) != 0) {
				System.out.println(String.valueOf(temp));
			}
			// F2- quick fix 사용 1.try catch 신중하게 잘 써야함. 2. unimplement method add
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void testFileRead3() {
		String filePath = "D:/data2/test/aaa.txt";
//		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

//			BufferedReader br = new BufferedReader(new FileReader(filePath));
//			br = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null)
//					br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//
//			}
		}
	}

	public void testFileRead2() {
		// 보조스트림
		String filePath = "D:/data2/test/aaa.txt";
		FileInputStream fis = null; // 선언
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 생성 순서 : 기반스트림 --> 보조스트림
			fis = new FileInputStream(filePath); // 생성 // 먼저 기반 뒤에 클로즈 // byte로 1번 읽고
//			InputStreamReader isr = new InputStreamReader(fis);
			// 위의것을 줄여서 나타내기
			isr = new InputStreamReader(fis); // 두번째 생성 보조 먼저 클로즈 // 문자로도 추가로 읽고 싶어함
			br = new BufferedReader(isr);

//			isr = new InputStreamReader(new FileInputStream(filePath));
//			br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

			String str = null; // 채팅에서 한줄씩 출력 하는 개념
			while ((str = br.readLine()) != null) { // nullpointException 발생시 .을 찾아야함
				System.out.println(str);
			}
//			String str = br.readLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			try {
				// 해제 순서 (생성반대순서) : 보조스트림 --> 기반스트림
				if (br != null)
					isr.close();
				if (fis != null)
					fis.close();

//				if (fis != null)
//					fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public void testFileRead() {
		String filePath = "D:/data2/test/aaa.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(filePath); // file과 jva 프로그램의 resource 통로
			try {
				// Unhandled exception Type IOException
				// 사용 불가 for(int i = - ; i<fr.)
//				방법1
//				int a = -1; // 보통은 0 , -1 , 1을 많이 준다. 0이상의 정수일경우 0보다 작은지 큰지만 파악 특히 char일때는 0이 기준
//				while ((a= fr.read())>-1) {		//ⓐ fr.read 랑
//				System.out.println((char)a);
//				while (fr.read() > -1) {
//					int a = fr.read();
//					System.out.println(a);
//			}
//				방법2 - 3
				int cntPerRead = 500;
				char[] readCharArr = new char[2500]; // 문자 뒤의 빈 공간 [nn]개
				for (int i = 0; i < readCharArr.length / cntPerRead; i++) {
					int readCnt = fr.read(readCharArr, i * cntPerRead, cntPerRead); // offset , 갯수 ⓑ fr.read는 오버로딩이라 별개임
					System.out.println(readCnt); // 50 :문자 50개 읽음
//					System.out.println(readCharArr);
					if (readCnt < cntPerRead) {
						break;
					}
				}
				System.out.println(readCharArr);

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다. 경로를 확인해 주세요.");
		} finally {
			// Unhandled exception Type IOException
			try {
				if (fr != null)
					fr.close(); // java.lang.NullPointerException 오류가 발생했을경우 null 초기값만추가 해준다.
								// nullpointException은 쓰지 않는다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("== testFileRead 끝 ==");
	}

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
			f2.createNewFile(); // 파일생성

			fw = new FileWriter(f2); // 스트림을 통해 통로를 만들어줌, File에 문자 형태 전송이 가능한 OutputStream (File과 Java 프로그램의 통로)
			fw.write("한글 한"); // 전송하고자 하는 문자
			fw.flush(); // 전송한 문자가 담긴 버퍼를 깨끗하게 밀어내기
			return; // finally는 return 조차 한번 들렸다가 해결하고 밖으로 나감

		} catch (IOException e) {

			System.out.println("file 생성 못함");
			e.printStackTrace();
		} finally { // return 전에 반드시 실행하고 넘어가는 문구
			try {
				if (fw != null) {
					fw.close();
				} // 개발자들이 흔하게 이렇게 많이 한줄코딩 씀 , 통로를 닫기
			} catch (IOException e) {
				e.printStackTrace();
			} // try catch 밖에 선언하고 종료 시킴
		}
	}
}
