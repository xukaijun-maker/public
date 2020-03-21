package com.cn.designpattern;
/**
 * 綫程安全 但是缺點明顯 類加載的時候就已經實例化了 容易導致浪費内存空間
 * */
public class Demo_饿汉单例设计模式 {
	private Demo_饿汉单例设计模式() {

	}// 防止被外界实例化

	private static Demo_饿汉单例设计模式 instance = new Demo_饿汉单例设计模式();// 将实例化的对象存放到全局的静态区域

	public static Demo_饿汉单例设计模式 getInstance() {
		// 给外界提供公共的访问方法获取实例
		return instance;
	}

	private static Demo_饿汉单例设计模式 instance2;

	static {
		instance2 = new Demo_饿汉单例设计模式();
	}

	public static Demo_饿汉单例设计模式 getInstance2() {
		// 给外界提供公共的访问方法获取实例
		return instance2;
	}
}
