package com.cn.designpattern;

public class Demo_新船_抽象工厂设计模式 implements Demo_船的公共属性_抽象工厂设计模式 {

	@Override
	public String getDescripation() {
		
		return "我是一只新的船";
	}

	@Override
	public void hold() {
		System.out.println("我能坚持行驶1万里");
	}

}
