package com.cn.designpattern;

public class Demo_年老的船长_抽象工厂设计模式 implements Demo_船长的公共行为_抽象工厂设计模式 {

	@Override
	public String getDescripation() {
		return "我是一名驾驶时常超过20年的老船长";
	}

	@Override
	public void drive() {
		System.out.println("我驾驶很穩");
	}

}
