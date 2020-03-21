package com.cn.dom4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * putIfAbsent：与原有put方法不同的是，putIfAbsent方法中如果插入的key相同，则不替换原有的value值；
 * remove：与原有remove方法不同的是，新remove方法中增加了对value的判断，如果要删除的key--value不能与Map中原有的key--
 * value对应上，则不会删除该元素;
 * replace(K,V,V)：增加了对value值的判断，如果key--oldValue能与Map中原有的key--value对应上，才进行替换操作；
 * replace(K,V)：与上面的replace不同的是，此replace不会对Map中原有的key--value进行比较，如果key存在则直接替换；
 */
public class Test {
	public static void main(String[] args) {
		Map<String, String> a = new HashMap<>();
		a.put("a", "s");
		a.put("a", "b");
		a.remove("a");
		System.out.println(a.toString());

		ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
		c.putIfAbsent("a", "g");
		c.putIfAbsent("a", "j");
		System.out.println(c.toString());
	}
}
