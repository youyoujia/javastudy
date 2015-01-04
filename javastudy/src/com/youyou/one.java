package com.youyou;

public class one {

	public static void main(String[] args){
		test();
	}

	private static void test() {
		int array[] = new int[600];
		int num = 500;
		int n;
		for(int i= 0; i<10; i++){
			n = 1+(int)(Math.random()*num);
			array[i] = n;
			num = num -n;
		}
		
		print(array);
	}

	private static void print(int[] array) {
		for(int i=0; i<10; i++){
			System.out.println("array = "+array[i]);
		}
	}
}
