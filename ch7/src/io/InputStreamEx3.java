package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class InputStreamEx3 {
	public static void main(String[] args) {
		//input : 키보드
		InputStream in = System.in;
		OutputStream out = System.out;
		
		
		//입력이 들어오면 읽어오기
		try {
			//read(byte[] b) : byte 배열만큼 읽어옴(읽어올 바이트가 없으면 -1 리턴)
			//			한글(3byte)은 깨질 수 밖에 없다.
			byte[] b = new byte[100];
			
			System.out.println("이름 : ");
			
			//읽어온 바이트 수
			int nameByte = in.read(b);
			
			//String 생성자를 이용해서 nameByte를 String으로 생성하기
			//enter : carriage return + line feed => 2byte 차감
			String name = new String(b,0,nameByte-2);
			
			System.out.println("하고 싶은 말 : ");
			int commentByte = in.read(b);
			//String 생성자를 이용해서 commentByte를 String으로 생성하기
			String comment = new String(b,0,commentByte-2);
						
			
			//생성한 String 출력
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
			
			
			
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
