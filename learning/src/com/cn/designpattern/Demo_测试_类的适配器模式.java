package com.cn.designpattern;

/**
 * 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
 */
public class Demo_测试_类的适配器模式 {
	public static void main(String[] args) {
		Demo_适配器出生解决问题_类的适配器模式 adpater = new Demo_适配器出生解决问题_类的适配器模式();
		adpater.common();
	}
}
