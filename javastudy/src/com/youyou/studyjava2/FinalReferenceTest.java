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
		//final�������������iArr��һ�����ñ���
		final int [] iArr  = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		
		//��������iArr���¸�ֵ���Ƿ�
		//iArr = null;
		
		final Persons p = new Persons();
		p.setAge(23);
		System.out.println(p.getAge());
		
		//��������P���¸�ֵ���Ƿ�
		//p = null;
		
	}

}
