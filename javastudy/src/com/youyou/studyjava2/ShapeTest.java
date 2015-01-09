package com.youyou.studyjava2;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Triangle("ºÚÉ«", 3, 4, 5);
		Shape s2 = new Circle("ºìÉ«", 3);
		
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}

}
