package com.youyou.studyjava;

public class InstanceofTest {
	public static void main(String[] args){
		
		//Object��������ĸ��ף���hello������ʵ��������String
		Object hello = "Hello";
		
		//String��Object������࣬���Խ���instanceof���㣬����true
		System.out.println("�ַ����Ƿ���Object���ʵ��:"+ (hello instanceof Object));
		
		//����true
		System.out.println("�ַ����Ƿ���String���ʵ��:"+ (hello instanceof String));
		
		//Math��Object������࣬���Խ���instanceof���㣬����false
		System.out.println("�ַ����Ƿ���Math���ʵ��:"+ (hello instanceof Math));
		
		//Stringʵ����Comparable�ӿڣ����Է���true
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ��:"+ (hello instanceof Comparable));
		
		/**
		 *
		 *String a = "Hello";
		*String��Ȳ���Math�࣬Ҳ����Math��ĸ���
		*System.out.println("�ַ����Ƿ���Math���ʵ��:"+ (a instanceof Math));
		 */
	}
}
