package com.youyou.studyjava;

class DataWrap {
	public int a;
	public int b;
	
	@Override
	public String toString() {
		
		return "swap方法里，a 的值是"+ a +"; b 的值是" + b ;
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}	
}

public class ReferenceTransferTest {
	public static void swap(DataWrap dw){
		System.out.println(dw.hashCode());
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println(dw.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataWrap dw = new DataWrap();
		System.out.println(dw.hashCode());
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println(dw.toString());
		
		
	}

}
