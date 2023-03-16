package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx1 {

	public static void main(String[] args) {
		// File 에서 내용 읽기
		// text, 음악, 동영상, 이미지...
		// text : byte 기반(FileInputStream), 문자 기반(FileReader)
		// 음악, 동영상, 이미지 : byte 기반
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".\\src\\FileEx4.java");
	
			int data = 0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		
		
		
		} catch (Exception e) {
			//FileInputStream() => FileNotFoundException
			//fis.read() => IOException
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
