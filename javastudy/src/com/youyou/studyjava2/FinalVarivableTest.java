package com.youyou.studyjava2;

public class FinalVarivableTest {
	//定义成员变量时制定默认值，合法
	final int a = 6;
	final String str;
	final int c;
	final static double d;
	
	//既没有制定默认值，又没有在初始化块、构造器中指定初始值
	//下面定义char Field是不合法的
	//final char ch;
	//初始化块，可对没有指定默认值的实例field指定初始值
	{
		str = "Hello";
		//定义 a的 field时已经指定了默认值
		//不能为a重新赋值，下面赋值语句非法
		//a = 9;	
	}
	static
	{
		//在静态初始化块中为类Field指定初始值
		d = 5.6;
	}
	public FinalVarivableTest()
	//构造器，可对既没有指定默认值，又没有在初始化块中制定初始值的实例Field指定初始值
	{
		//如果初始化块中对str指定了初始值，则构造器中不能对final变量重新赋值，下面赋值语句非法
		//str = "java";
		c = 12;
	}
	
	public void changeFinal(){
		//普通方法不能为final修饰的成员变量赋值
		//d = 1.2;
		//不能在普通方法中为final成员变量指定初始值
		//ch = 'a';
	}
	public static void main(String[] args){
		FinalVarivableTest ft = new FinalVarivableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
		System.out.println(ft.str);		
	}
	
}
