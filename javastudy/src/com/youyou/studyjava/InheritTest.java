package com.youyou.studyjava;


abstract class Animals{
	private void beat(){
		System.out.println("��������������");
	}
	public void breath(){
		System.out.println("��һ��������һ�����������С�����");
	}
}

//�̳�Animal��ֱ�Ӹ��ø����breath����
class Bird extends Animals{
	public void fly(){
		System.out.println("����������ڵķ��衣����");
	}
}

//�̳�Animal��ֱ�Ӹ��ø����breath����
class Wolfs extends Animals{
	public void run(){
		System.out.println("����½���ϵĿ��ٱ��ܡ�����");
	}
}

public class InheritTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a  = new Bird();
		Bird b = new Bird();
		a.breath();
		b.fly();
		Wolfs w = new Wolfs();
		w.breath();
		w.run();
	}

}
