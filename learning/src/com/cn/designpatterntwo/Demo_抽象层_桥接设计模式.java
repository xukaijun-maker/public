package com.cn.designpatterntwo;
/**
 * 核心類 將實現和抽象分離
 * */
public abstract class Demo_抽象层_桥接设计模式 {

	private Demo_待实现的抽象方法集_桥接设计模式 implementor;

	public Demo_待实现的抽象方法集_桥接设计模式 getImplementor() {
		return implementor;
	}

	public void setImplementor(Demo_待实现的抽象方法集_桥接设计模式 implementor) {
		this.implementor = implementor;
	}
	/**
	 * 不管哪个系统，对应接口的A类方法
	 * */
	public abstract void operationone();
	/**
	 * 不管哪个系统，对应接口的B类方法
	 * */
	public abstract void operationtwo();

}
