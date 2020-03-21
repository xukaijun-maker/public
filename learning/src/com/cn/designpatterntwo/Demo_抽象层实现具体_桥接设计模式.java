package com.cn.designpatterntwo;

public class Demo_抽象层实现具体_桥接设计模式 extends Demo_抽象层_桥接设计模式 {

	@Override
	public void operationone() {
		super.getImplementor().doitone();
	}

	@Override
	public void operationtwo() {
		super.getImplementor().doittwo();
	}

}
