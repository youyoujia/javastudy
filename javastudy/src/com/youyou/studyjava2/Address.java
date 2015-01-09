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
	
	//重写equals方法，判断两个对象是否相等
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj != null && obj.getClass() == Address.class){
			Address ad = (Address)obj;
			//当detail和postCode相等时，可以认为两个Address对象相等
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
		//这里不知道怎么测试
	}

}
