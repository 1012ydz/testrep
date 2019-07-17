package com.mycompany.app;


import java.util.Date;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Date date = new Date();
		Object myObject = null;
		test(10);
		System.out.println("代码执行完毕");

	}
	public static void test(int c){
		for (int i = 0; i <c ; i++) {
			System.out.println("打印参数:"+i);
		}
		User user=new User();
		String say=user.say();
		System.out.println("说了什么:"+say);
	}
}
