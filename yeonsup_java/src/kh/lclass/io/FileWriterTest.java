package kh.lclass.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("d:/data/a.txt")) {
			fw.write("Hello, World");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");

	}

}
