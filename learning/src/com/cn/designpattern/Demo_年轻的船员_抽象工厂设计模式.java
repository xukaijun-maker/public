package com.cn.designpattern;

public class Demo_年轻的船员_抽象工厂设计模式 implements Demo_船员的公共行为_抽象工厂设计模式 {

	@Override
	public String getDescripation() {
		return "我是年轻的船员";
	}

	@Override
	public void think() {
		System.out.println("年轻的船员遇到问题不能冷静思考！！");
	}

}
