package com.youyou.studyjava;

class DataWrap{
	public int a;
	public int b;
}

public class ReferenceTransferTest {
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap方法里，a 的值是"+ dw.a + "; b 的值是" + dw.b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，变量 a 的值是"+ dw.a + "; 变量 b 的值是" + dw.b );
		
		
	}

}
