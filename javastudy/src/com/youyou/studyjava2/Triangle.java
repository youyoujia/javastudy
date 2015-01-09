package com.youyou.studyjava2;

public class Triangle  extends Shape{
	private double a;
	private double b;
	private double c;
	
	public Triangle(String color, double a, double b, double c){
		super(color);
		this.setSides(a,b,c);
	}
	
	public void setSides(double a, double b, double c){
		if(a >= b + c || b >= a + c || c >= b + a){
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return a + b + c;
	}
	
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return "������";
	}
	
}
