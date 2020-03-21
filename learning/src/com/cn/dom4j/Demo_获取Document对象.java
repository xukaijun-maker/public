package com.cn.dom4j;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

public class Demo_获取Document对象 {
	/**
	 * @param url
	 * @return document
	 */
	public Document getDocByUrl(URL url) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(url);
		return document;
	}

	/**
	 * @param file
	 * @return document
	 */
	public Document getDocByFile(File file) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(file);
		return document;
	}
	/**
	 * @param inputstream
	 * @return document
	 */
	public Document getDocByInputstream(InputStream inputstream) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputstream);
		return document;
	}
	/**
	 * @param inputSource
	 * @return document
	 */
	public Document getDocByInputSource(InputSource inputSource) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputSource);
		return document;
	}
}
