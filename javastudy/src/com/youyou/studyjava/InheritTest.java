package com.youyou.studyjava;


abstract class Animals{
	private void beat(){
		System.out.println("心脏跳动。。。");
	}
	public void breath(){
		System.out.println("吸一口气，吐一口气，呼吸中。。。");
	}
}

//继承Animal，直接复用父类的breath方法
class Bird extends Animals{
	public void fly(){
		System.out.println("我在天空自在的飞翔。。。");
	}
}

//继承Animal，直接复用父类的breath方法
class Wolfs extends Animals{
	public void run(){
		System.out.println("我在陆地上的快速奔跑。。。");
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
