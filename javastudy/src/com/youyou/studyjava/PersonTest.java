package com.youyou.studyjava;


public class PersonTest {
	public static void main(String[] args){
		Person p = new Person();
		p.setAge(1000);
		 System.out.println("未能设置age Field时：" + p.getAge());
		 
		p.setAge(30);
		 System.out.println("成功设置age Field后：" + p.getAge());
		 
		p.setName("李刚");
		 System.out.println("成功设置name Field后：" + p.getName());

	}
}
