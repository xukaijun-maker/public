package com.cn.designpattern;

public class Demo_年轻工厂_抽象工厂设计模式 implements Demo_总工厂_抽象工厂设计模式 {

	@Override
	public Demo_船员的公共行为_抽象工厂设计模式 createSailor() {
		
		return new Demo_年轻的船员_抽象工厂设计模式();
	}

	@Override
	public Demo_船的公共属性_抽象工厂设计模式 createShip() {
		
		return new Demo_新船_抽象工厂设计模式();
	}

	@Override
	public Demo_船长的公共行为_抽象工厂设计模式 createCaptain() {
		
		return new Demo_年轻的船长_抽象工厂设计模式();
	}

}
