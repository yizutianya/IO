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
			//fis.read(buff) ����������ȡ�����ݲ��������ݳ���
				while((hasread=fis.read(bbuf))>0){
					//ÿ��ȡһ�μ�д���ļ����������ȡһ��дһ��
					fos.write(bbuf, 0, hasread);
				}
			System.out.println("����ļ�newfile �ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}