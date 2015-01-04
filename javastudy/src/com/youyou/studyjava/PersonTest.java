package com.youyou.studyjava;

class Person{
	public String name;
	public static int eyeNum;
}

public class PersonTest {
	public static void main(String[] args){
		System.out.println("person 的 eyeNum 类 Field值：" +Person.eyeNum);
		
		Person p = new Person();
		System.out.println("p 变量的name Field值是：" + p.name + " ; p 对象的eyeNum Field值是：" + p.eyeNum);
		
		p.name = "孙悟空";
		p.eyeNum = 2;
		System.out.println("p 变量的name Field值是：" + p.name + " ; p 对象的eyeNum Field值是：" + p.eyeNum);
		System.out.println("person 的 eyeNum 类 Field值：" +Person.eyeNum);
		
		Person p2 = new Person();
		System.out.println( "p2 对象的eyeNum Field值是：" + p2.eyeNum);
		
	}
}
