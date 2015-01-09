package com.youyou.studyjava2;

public class Address {
	private final String detail;
	private final String postCode;
	
	public Address(){
		this.detail = "";
		this.postCode = "";
	}
	
	public Address(String detail, String postCode){
		this.detail = detail;
		this.postCode = postCode;
	}
	public String getDetail(){
		return this.detail;
	}
	public String getPostCode(){
		return this.postCode;
	}
	
	//��дequals�������ж����������Ƿ����
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj != null && obj.getClass() == Address.class){
			Address ad = (Address)obj;
			//��detail��postCode���ʱ��������Ϊ����Address�������
			if(this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode())){
				return true;
			}
		}
		return false;
	}
	//  adrress(1 2).hashcode=1+2*31     address(1,2)
	public int hashCode(){
		return detail.hashCode() + postCode.hashCode() * 31;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ﲻ֪����ô����
	}

}
