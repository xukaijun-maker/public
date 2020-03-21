package com.cn.designpattern;

public class Demo_年轻的船长_抽象工厂设计模式 implements Demo_船长的公共行为_抽象工厂设计模式{

	@Override
	public String getDescripation() {
		
		return "我是刚上任的新船长";
	}

	@Override
	public void drive() {
		System.out.println("我的驾驶经验还是不足");
	}

}
