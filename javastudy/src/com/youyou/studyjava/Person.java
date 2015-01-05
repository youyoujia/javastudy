package com.youyou.studyjava;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name){
		//健壮性，假如名字为空，则要抛出异常
		if(name  == null){
			throw new NullPointerException();
		}
		
		if(name.length() > 6 || name.length() < 2){
			System.out.println("您设置的人名不符合要求");
		}
		
		else{
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		if(age > 100 || age < 0 ){
			System.out.println("您设置的年龄不合法");
			return;
		}
		else{
			this.age = age;
		}
	}
	
	public int getAge(){
		return this.age;
	}
}