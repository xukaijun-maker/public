package com.cn.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws IOException {
		Person person=new Person();
		person.setName("徐凯俊");
		person.setAge(18);
		person.setSex(1);
		ObjectOutputStream objectOutputStream=null;
		ObjectInputStream inputStream=null;
		
		try {
			objectOutputStream=new ObjectOutputStream(new FileOutputStream("tempfile"));
			objectOutputStream.writeObject(person);
			objectOutputStream.flush();
			inputStream=new ObjectInputStream(new FileInputStream(new File("tempfile")));
			Person person2=(Person) inputStream.readObject();
			System.out.println(person2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			objectOutputStream.close();
		}
		
		
	}
}
