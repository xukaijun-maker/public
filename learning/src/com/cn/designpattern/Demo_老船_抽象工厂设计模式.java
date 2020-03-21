package com.cn.designpattern;

public class Demo_老船_抽象工厂设计模式 implements Demo_船的公共属性_抽象工厂设计模式 {

	@Override
	public String getDescripation() {
		return "我是一艘老船";
	}

	@Override
	public void hold() {
		System.out.println("我現在行驶距离很短");
	}

}
