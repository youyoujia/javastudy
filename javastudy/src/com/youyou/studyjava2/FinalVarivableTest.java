package com.youyou.studyjava2;

public class FinalVarivableTest {
	//�����Ա����ʱ�ƶ�Ĭ��ֵ���Ϸ�
	final int a = 6;
	final String str;
	final int c;
	final static double d;
	
	//��û���ƶ�Ĭ��ֵ����û���ڳ�ʼ���顢��������ָ����ʼֵ
	//���涨��char Field�ǲ��Ϸ���
	//final char ch;
	//��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ��ʵ��fieldָ����ʼֵ
	{
		str = "Hello";
		//���� a�� fieldʱ�Ѿ�ָ����Ĭ��ֵ
		//����Ϊa���¸�ֵ�����渳ֵ���Ƿ�
		//a = 9;	
	}
	static
	{
		//�ھ�̬��ʼ������Ϊ��Fieldָ����ʼֵ
		d = 5.6;
	}
	public FinalVarivableTest()
	//���������ɶԼ�û��ָ��Ĭ��ֵ����û���ڳ�ʼ�������ƶ���ʼֵ��ʵ��Fieldָ����ʼֵ
	{
		//�����ʼ�����ж�strָ���˳�ʼֵ���������в��ܶ�final�������¸�ֵ�����渳ֵ���Ƿ�
		//str = "java";
		c = 12;
	}
	
	public void changeFinal(){
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		//d = 1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
		//ch = 'a';
	}
	public static void main(String[] args){
		FinalVarivableTest ft = new FinalVarivableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
		System.out.println(ft.str);		
	}
	
}
