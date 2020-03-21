package com.cn.designpattern;
/**
 * 懶漢模式注意綫程安全的設計
 * */
public class Demo_懒汉单例设计模式 {
	private Demo_懒汉单例设计模式() {
		//防止外界直接实例化
	}
	
	private static Demo_懒汉单例设计模式 instance;
	
	public static Demo_懒汉单例设计模式 getInstance(){
		if(instance==null){
			instance=new Demo_懒汉单例设计模式();
		}
		return instance;//这个是非线程安全的 多线程容易出现获取多个实例
	}
	
	public synchronized static Demo_懒汉单例设计模式 getInstance2(){
		if(instance==null){
			instance=new Demo_懒汉单例设计模式();
		}
		return instance;//这个是线程安全的 但是效率比較慢 該方法只允許單個綫程訪問 無法同時訪問 需要綫程排隊
	}
	
	public static Demo_懒汉单例设计模式 getInstance3(){
		if(instance==null){
			synchronized (Demo_懒汉单例设计模式.class) {
				instance=new Demo_懒汉单例设计模式();
			}
		}
		return instance;//这个是线程非安全的 可能某一個綫程正在實例化或者已經實例化一個對象另外一個綫程已經走到了判斷條件的邏輯 導致生成多個實例
	}
	public static Demo_懒汉单例设计模式 getInstance4(){
		if(instance==null){
			synchronized (Demo_懒汉单例设计模式.class) {
				if(instance==null){
					instance=new Demo_懒汉单例设计模式();
				}
			}
		}
		return instance;//这个是线程安全的 效率高 支持使用
	}
}
