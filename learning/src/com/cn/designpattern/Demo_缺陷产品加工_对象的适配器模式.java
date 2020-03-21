package com.cn.designpattern;

public class Demo_缺陷产品加工_对象的适配器模式 implements Demo_客户希望的效果_类的适配器模式 {

	private Demo_目前局限的功能_类的适配器模式 before;// 有缺陷的对象无法满足客户的要求

	public Demo_缺陷产品加工_对象的适配器模式(Demo_目前局限的功能_类的适配器模式 a) {
		before = a;
	}

	@Override
	public void common() {
		System.out.println("提前帮你加工下，剩下的留给你做");
		before.sinple();
		System.out.println("完成客户需求！！");
	}
	

}
