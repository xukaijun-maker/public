package com.cn.designpattern;
/**
 * 一个系统应该独立于其产品是如何创建、组合和表示的
 *	一个系统需要配置多个系列中的一种产品
 *	一个相关产品对象的集合被设计用于一起使用，并且需对这个集合进行约束
 *	关于一个类的产品，使用者要特别关注它们的接口，而不是它们的实现
 *	依赖关系的生命周期理论上比使用者的生命周期短
 *	需要一个在运行时才能确定的参数来构造一个特定的依赖对象
 *	需要在运行时决定从一个集合中调用哪个系列的产品
 *	需要提供若干个只在运行时才知道的参数，然后才能解决依赖关系
 *  https://github.com/JamesZBL/java_design_patterns
 **/
public class Demo_测试_抽象工厂设计模式 {
	public static void main(String[] args) {
		Demo_总工厂_抽象工厂设计模式 factory=new Demo_年老工厂_抽象工厂设计模式();
		Demo_船长的公共行为_抽象工厂设计模式 Captain= factory.createCaptain();
		System.out.println(Captain.getDescripation());
		Captain.drive();
	}
}
