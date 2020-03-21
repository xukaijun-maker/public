package com.cn.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Demo_測試 {
	public static void main(String[] args) throws DocumentException {
     Deme_创建DOC对象 a=new Deme_创建DOC对象();
     Document b=a.createDocument();
     String c=b.asXML();
     System.out.println(c);
     Document e=DocumentHelper.parseText(c);
	}
}
