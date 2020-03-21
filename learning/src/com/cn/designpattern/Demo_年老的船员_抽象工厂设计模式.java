package com.cn.designpattern;

public class Demo_年老的船员_抽象工厂设计模式 implements Demo_船员的公共行为_抽象工厂设计模式 {

	@Override
	public String getDescripation() {
		return "我是年老的船员";
	}

	@Override
	public void think() {
		System.out.println("作为老船员我遇事特别冷静");
	}

}
