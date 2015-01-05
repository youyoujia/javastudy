package com.youyou.studyjava;

class Base{
	public Base(){
		test();
	}
	public void test(){
		System.out.println("将被子类重写的方法");
	}
}

public class Sub extends Base{
	
	private String name;
	public void test(){
		System.out.println("子类重写父类的方法，" + "其name字符串长度" + name.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
	}

}
