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
	
	//重写equals方法，提供自定义的相等标准
	public boolean equals(Object obj){
		//如果两个对象为同一个对象
		if(this == obj)
			return true;
		//当obj不为null，且它是Person类的实例时
		if(obj != null && obj.getClass() == Person.class){
			Person personObj = (Person)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
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
		Person p1 = new Person("王小华","123456");
		Person p2 = new Person("王小华","123456");
		Person p3 = new Person("王小华","654321");
		Person p4 = new Person("王哈哈","123456");
		
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等？" + p1.equals(p2));
		
		//p3和p1的idStr不相等，所以输出false
		System.out.println("p3和p1是否相等？" + p1.equals(p3));
		
		//p4和p1的name不相等，所以输出false
		System.out.println("p4和p1是否相等？" + p1.equals(p4));
	}

}
