package com.youyou.studyjava2;

public abstract class Shape {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	
	public Shape(){}
	public Shape (String color){
		System.out.println("ִ��Shape�Ĺ�����");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
