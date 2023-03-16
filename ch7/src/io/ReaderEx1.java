package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {

	public static void main(String[] args) {
		
		//Reader, Writer : 문자기반
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("c:\\temp\\file1.txt");
			writer = new FileWriter("c:\\temp\\output1.txt");
			
//			//ms949 : 윈도우즈용
//			reader = new FileReader("c:\\temp\\file1.txt",Charset.forName("ms949"));

//			화면출력
			int data = 0;
			while((data = reader.read())!=-1) {
				writer.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
