package com.youyou.studyjava2;

import java.util.Arrays;

class Persons{
	private int age;
	public Persons(){}
	public Persons(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class FinalReferenceTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final修饰数组变量，iArr是一个引用变量
		final int [] iArr  = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		
		//下面语句对iArr重新赋值，非法
		//iArr = null;
		
		final Persons p = new Persons();
		p.setAge(23);
		System.out.println(p.getAge());
		
		//下面语句对P重新赋值，非法
		//p = null;
		
	}

}
