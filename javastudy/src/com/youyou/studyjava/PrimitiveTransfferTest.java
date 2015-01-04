package com.youyou.studyjava;

public class PrimitiveTransfferTest {
	public static void swap(int a, int b)
	{
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("swap方法里，a 的值是"+ a + "; b 的值是" + b );
	}
	
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("交换结束后，变量 a 的值是"+ a + "; 变量 b 的值是" + b );
	}
}
