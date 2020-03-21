package com.cn.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_测试输入流读取效率 {
	/**
	 * 一个字节一个字节的读取并操作
	 */
	public static long readFileOneByOne(File file,File goal) {
		long start = System.currentTimeMillis();
		FileInputStream fileInputStream;
		FileOutputStream fileOutputStream;
		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(goal);
			int data = -1;
			while ((data = fileInputStream.read()) != -1) {
				fileOutputStream.write(data);
				fileOutputStream.flush();
				fileOutputStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long readFileByContent(File file,File goal) {
		long start = System.currentTimeMillis();
		FileInputStream fileInputStream;
		FileOutputStream fileOutputStream;
		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(goal);
			int data;
			byte[] a = new byte[1024];
			while ((data = fileInputStream.read(a)) != -1) {
				fileOutputStream.write(a, 0, 1024);
				fileOutputStream.flush();
				fileOutputStream.close();
				fileInputStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static void main(String[] args) {
		File file=new File("E:\\text.txt");
		//File file2=new File("E:\\text2.txt");
		File file3=new File("E:\\text3.txt");
		//long a=readFileOneByOne(file,file2);
		//System.out.println("一个字节单独读取的时间"+a);
		long b=readFileByContent(file,file3);
		System.out.println("用缓冲区的时间"+b);
		
	}
}
