package com.youyou.studyjava2;

public class Circle extends Shape{
	private double radius;
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return getColor() + "Բ��";
	}
	
}
