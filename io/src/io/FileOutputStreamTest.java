package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("src/io/FileOutputStreamTest.java");
			FileOutputStream fos = new FileOutputStream("newFile.txt")) 
			{byte[] bbuf = new byte[32];
			int hasread=0;
			//fis.read(buff) 从输入流中取出数据并返回数据长度
				while((hasread=fis.read(bbuf))>0){
					//每读取一次即写入文件输出流，读取一次写一次
					fos.write(bbuf, 0, hasread);
				}
			System.out.println("输出文件newfile 成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
