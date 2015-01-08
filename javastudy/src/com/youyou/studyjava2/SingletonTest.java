package com.youyou.studyjava2;

class Singleton{
	private static Singleton instance;
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}

}
