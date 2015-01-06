package com.youyou.studyjava2;

import org.omg.CORBA.PERSIST_STORE;

import com.youyou.studyjava.PersonTest;

class Person{
	private String name;
	private String idStr;
	public Person(){}
	public Person(String name, String idStr){
		this.name = name;
		this.idStr = idStr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	
	//��дequals�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj){
		//�����������Ϊͬһ������
		if(this == obj)
			return true;
		//��obj��Ϊnull��������Person���ʵ��ʱ
		if(obj != null && obj.getClass() == Person.class){
			Person personObj = (Person)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if(this.getName().equals(personObj.getName())){
				if(this.getIdStr().endsWith(personObj.getIdStr())){
					return true;
				}			
			}
		}
		return false;
	}
}
public class OverrideEqualsRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("��С��","123456");
		Person p2 = new Person("��С��","123456");
		Person p3 = new Person("��С��","654321");
		Person p4 = new Person("������","123456");
		
		//p1��p2��idStr��ȣ��������true
		System.out.println("p1��p2�Ƿ���ȣ�" + p1.equals(p2));
		
		//p3��p1��idStr����ȣ��������false
		System.out.println("p3��p1�Ƿ���ȣ�" + p1.equals(p3));
		
		//p4��p1��name����ȣ��������false
		System.out.println("p4��p1�Ƿ���ȣ�" + p1.equals(p4));
	}

}
