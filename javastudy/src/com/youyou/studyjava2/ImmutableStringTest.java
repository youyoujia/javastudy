package com.youyou.studyjava2;

public class ImmutableStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		

		//输出false
		System.out.println(str1 == str2);
		
		//String str1 = "Hello";
		//String str2 = "Hello";
		//输出true
	    //System.out.println(str1 == str2);
		
		//输出true
		System.out.println(str1.equals(str2));
		
		//下面两次输出的hashCode相同
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
