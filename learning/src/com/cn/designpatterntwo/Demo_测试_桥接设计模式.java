package com.cn.designpatterntwo;
/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * */
public class Demo_测试_桥接设计模式 {
	public static void main(String[] args) {		
		Demo_抽象层_桥接设计模式 a=new Demo_抽象层实现具体_桥接设计模式();
		a.setImplementor(new Demo_实现层模块一_桥接设计模式());
		a.operationone();
		a.operationtwo();
		a.setImplementor(new Demo_实现层模块二_桥接设计模式());
		a.operationone();
		a.operationtwo();	
 	}
}
