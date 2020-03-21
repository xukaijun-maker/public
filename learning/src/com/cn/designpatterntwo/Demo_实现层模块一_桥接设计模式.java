package com.cn.designpatterntwo;

public class Demo_实现层模块一_桥接设计模式 implements Demo_待实现的抽象方法集_桥接设计模式{

	@Override
	public void doitone() {
		System.out.println("系统1处理A类抽象方法1");
	}

	@Override
	public void doittwo() {
		System.out.println("系统1处理B类抽象方法");
	}

}
