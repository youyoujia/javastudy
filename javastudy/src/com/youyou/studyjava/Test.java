package com.youyou.studyjava;

class Root{
	static{
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲����Ĺ�����");
	}
}

class Mid extends Root{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid(){
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg){
		//ͨ��this����ͬһ�������صĹ�����
		this();
		System.out.println("Mid�Ĵ������������������ֵ��"+ msg);
	}
}

class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	public Leaf(){
		//ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("���java����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Leaf();
		new Leaf();
	}

}
