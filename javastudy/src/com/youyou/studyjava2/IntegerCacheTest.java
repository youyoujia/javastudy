package com.youyou.studyjava2;

public class IntegerCacheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in1 = new Integer(6);
		//�����µ�Integer���󣬲�����ö���
		Integer in2 = Integer.valueOf(6);
		//ֱ�Ӵӻ�����ȡ��Integer����
		Integer in3 = Integer.valueOf(6);
		
		System.out.println(in1 == in2);
		System.out.println(in2 == in3);
		
		//����Integerֻ����-128~127֮���ֵ
		//���200��Ӧ��Integer����û�б�����
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5);
	}

}
