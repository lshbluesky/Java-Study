package week14.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReaderWriterEx {
	public static void main(String[] args) {
//		OutputStreamWriter로 파일 쓰기
		String data = "안녕하세요, OutputStreamWriter 예제입니다.";

		// 1. File 객체 생성
		// 2. FileOutputStream 객체 생성
		// 3. OutputStreamWriter 객체 생성
		
		try (OutputStreamWriter writer
				= new OutputStreamWriter(
						new FileOutputStream("c:/test/outputsrw.txt"), "MS949")) { // MS949로 저장
			writer.write(data); // 문자열 데이터를 쓰기
			writer.flush(); // 버퍼 비우기
		} catch (IOException e) {
			e.printStackTrace();
		}

//		InputStreamReader로 파일 읽기
		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("c:/test/outputsrw.txt"), "UTF-8")) { // UTF-8로
																														// 읽기
			int munja;
			while ((munja = reader.read()) != -1) { // 한 문자씩 읽기
				System.out.print((char) munja); // 읽은 데이터를 문자로 변환
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
