package com.cn.designpattern;

public interface Demo_总工厂_抽象工厂设计模式 {
	
	Demo_船员的公共行为_抽象工厂设计模式 createSailor();
	
	Demo_船的公共属性_抽象工厂设计模式 createShip();
	
	Demo_船长的公共行为_抽象工厂设计模式 createCaptain();
}
