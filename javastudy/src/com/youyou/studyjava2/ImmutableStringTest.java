package com.youyou.studyjava2;

public class ImmutableStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		

		//���false
		System.out.println(str1 == str2);
		
		//String str1 = "Hello";
		//String str2 = "Hello";
		//���true
	    //System.out.println(str1 == str2);
		
		//���true
		System.out.println(str1.equals(str2));
		
		//�������������hashCode��ͬ
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
