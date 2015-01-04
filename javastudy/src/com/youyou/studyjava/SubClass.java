package com.youyou.studyjava;

class BaseClass{
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类的被覆盖的方法");
	}
}

public class SubClass extends BaseClass {
	
	public String book = "轻量级java EE 企业应用实战";
	
	public void test(){
		System.out.println("子类的覆盖父类的方法");
	}
	
	public void sub(){
		System.out.println("子类的普通方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);
		ploymophicBc.base();
		ploymophicBc.test();
		//ploymophicBc.sub();
		
	}

}
