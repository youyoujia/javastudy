package com.youyou.studyjava2;

public class StringJoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "���Java";
		String s2 = "���" + "Java"; 
				
		System.out.println(s1 == s2);
		
		String str1 = "���";
		String str2 = "Java";
		
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}

}
