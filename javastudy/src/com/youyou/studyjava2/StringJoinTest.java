package com.youyou.studyjava2;

public class StringJoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "·è¿ñJava";
		String s2 = "·è¿ñ" + "Java"; 
				
		System.out.println(s1 == s2);
		
		String str1 = "·è¿ñ";
		String str2 = "Java";
		
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}

}
