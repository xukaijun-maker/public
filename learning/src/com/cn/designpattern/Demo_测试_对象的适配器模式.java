package com.cn.designpattern;

public class Demo_测试_对象的适配器模式 {
	public static void main(String[] args) {
		Demo_目前局限的功能_类的适配器模式 a=new Demo_目前局限的功能_类的适配器模式();
		
		Demo_客户希望的效果_类的适配器模式 adpater=new Demo_缺陷产品加工_对象的适配器模式(a);
		
		adpater.common();
		
   	}
}
