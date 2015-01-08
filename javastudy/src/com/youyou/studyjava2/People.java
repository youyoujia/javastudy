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
	 * ���ַ�������ʹpeople�����˿ɱ���
	 * public People(Name name){
	 *	this.name = name;
	 * }
	 * public Name getName(){
	 *	return name;
	 * }
	 */
	
	//���ַ�����people���ǲ��ɱ���
	public People(Name name){
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	
	public Name getName(){
		//����һ���������󣬸ö����firstName��lastName
		return new Name(name.getFirstName(), name.getLastName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n = new Name("С��","��");
	    People p = new People(n);
		System.out.println(p.getName().getFirstName());
		
		//�ı�people�����name ��firstName��ֵ
		n.setFirstName("����");
		System.out.println(p.getName().getFirstName());
	}

}
