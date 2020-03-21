package com.cn.designpattern;

public class Demo_适配器出生解决问题_类的适配器模式 extends Demo_目前局限的功能_类的适配器模式 implements Demo_客户希望的效果_类的适配器模式 {

	@Override
	public void common() {
		//处理之前无法满足的需求
		System.out.println("您别着急，我先帮你处理下你解决不了的事情，剩下的留给你，你的能力可以解决了");
		super.sinple();
		System.out.println("客户的要求解决了！！！");	
	}
}
