package week14.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		String data = "안녕하세요, 자바 FileOutputStream 예제입니다.";
		try (FileOutputStream fos = new FileOutputStream("c:/test/output.txt")) {
			fos.write(data.getBytes()); // 문자열을 바이트 배열로 변환하여 파일에 씀
		} catch (IOException e) {
			e.printStackTrace();
		}

//	        String data2 = "\n추가된 내용입니다.";
//	        try (FileOutputStream fos = new FileOutputStream("c:/test/output.txt", true)) { // true는 append 모드
//	            fos.write(data2.getBytes());
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
	}
}
