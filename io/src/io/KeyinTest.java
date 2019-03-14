package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
	public static void main(String[] args) {
		//将System.in对象转换成Reader对象
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String line =null;
		try {
			while((line = br.readLine())!= null){
				if(line.equalsIgnoreCase("exit")){
					System.exit(1);
				}
				//打印输出读取的内容
				System.out.println("输入 内容为："+ line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
