package com.youyou.studyjava2;

class Name{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
}
public class People {
	private final Name name;
	
	/*
	 * 这种方法，会使people类变成了可变类
	 * public People(Name name){
	 *	this.name = name;
	 * }
	 * public Name getName(){
	 *	return name;
	 * }
	 */
	
	//这种方法，people类是不可变类
	public People(Name name){
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	
	public Name getName(){
		//返回一个匿名对象，该对象的firstName和lastName
		return new Name(name.getFirstName(), name.getLastName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n = new Name("小雅","张");
	    People p = new People(n);
		System.out.println(p.getName().getFirstName());
		
		//改变people对象的name 的firstName的值
		n.setFirstName("侨乡");
		System.out.println(p.getName().getFirstName());
	}

}
