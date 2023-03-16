package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class InputStreamEx2 {
	public static void main(String[] args) {
		//input : 키보드
		InputStream in = System.in;
		
		//output : 화면
		OutputStream out = System.out;
			
		//입력이 들어오면 읽어오기
		try {
			//read(byte[] b) : byte 배열만큼 읽어옴(읽어올 바이트가 없으면 -1 리턴)
			//			한글(3byte)은 깨질 수 밖에 없다.
			byte[] b = new byte[100];
			while (in.read(b) != -1) {
				out.write(b);
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//스트림 닫기
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
