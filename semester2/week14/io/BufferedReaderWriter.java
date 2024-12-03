package week14.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		// #파일객체 생성
		File readerWriterFile = new File("c:/test/BufferedFile.txt");

		// #1.FileWiter를 이용한 파일 쓰기 (UTF-8 모드)
		try (Writer writer = new FileWriter(readerWriterFile); BufferedWriter bw = new BufferedWriter(writer);) {
			bw.write("안녕하세요\n".toCharArray()); // 문자열을 문자 배열(char[])로 변환한 후 파일에 쓰기
			bw.write("안녕하세요\n"); // 내부적으로 문자열을 char[]로 변환하여 파일에 쓰기, 더 효율적
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();

		} catch (IOException e) {
		}

		// #2.FileReader를 이용한 파일 읽기 (UTF-8 모드)
		try (Reader reader = new FileReader(readerWriterFile); BufferedReader br = new BufferedReader(reader);) {
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}

		} catch (IOException e) {
		}
	}
}
