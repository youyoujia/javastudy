package com.youyou.studyjava;

class Base{
	public Base(){
		test();
	}
	public void test(){
		System.out.println("����������д�ķ���");
	}
}

public class Sub extends Base{
	
	private String name;
	public void test(){
		System.out.println("������д����ķ�����" + "��name�ַ�������" + name.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
	}

}
