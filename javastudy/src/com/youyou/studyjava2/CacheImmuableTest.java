package com.youyou.studyjava2;
//����е������
class CacheImmutable{
	private static int MAX_SIZE = 10;
	//ʹ���������������е�ʵ��
	private  static CacheImmutable [] cache = new CacheImmutable[MAX_SIZE];
	
	//��¼����ʵ���ڻ����е�λ�ã�cache[pos-1]�����»����ʵ��
	private static int pos = 0;
	private final String name;
	
	public CacheImmutable(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static CacheImmutable valueOf(String name){
		//�����ѻ���Ķ���
		for(int i = 0; i < MAX_SIZE; i++){
			//���������ͬʵ������ֱ�ӷ��ظû����ʵ��
			if(cache[i] != null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		
		//������������
		if(pos == MAX_SIZE){
			//�ѻ���ĵ�һ�����󸲸ǣ����Ѹո����ɵĶ�����ڻ���ص��ʼλ��
			cache[0] = new CacheImmutable(name);
			pos = 1;
		}
		else{
			//���´����Ķ��󻺴�������pos��1
			cache[pos++] = new CacheImmutable(name);
		}
		return cache[pos -1];
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if( obj != null && obj.getClass() == CacheImmutable.class){
			CacheImmutable ci = (CacheImmutable)obj;
			return name.equals(ci.getName());
		}
		return false;
	}
	public int hashCode(){
		return name.hashCode();
	}
}
public class CacheImmuableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CacheImmutable c1 = CacheImmutable.valueOf("hello");
		CacheImmutable c2 = CacheImmutable.valueOf("hello");
		CacheImmutable c3 =new CacheImmutable("hello");
		System.out.println(c1 == c2);
		System.err.println(c1.equals(c3));
	}

}
