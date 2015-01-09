package com.youyou.studyjava2;
//这个有点难理解
class CacheImmutable{
	private static int MAX_SIZE = 10;
	//使用数组来缓存已有的实例
	private  static CacheImmutable [] cache = new CacheImmutable[MAX_SIZE];
	
	//记录缓存实例在缓存中的位置，cache[pos-1]是最新缓存的实例
	private static int pos = 0;
	private final String name;
	
	public CacheImmutable(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static CacheImmutable valueOf(String name){
		//遍历已缓存的对象
		for(int i = 0; i < MAX_SIZE; i++){
			//如果已有相同实例，则直接返回该缓存的实例
			if(cache[i] != null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		
		//如果缓存池已满
		if(pos == MAX_SIZE){
			//把缓存的第一个对象覆盖，即把刚刚生成的对象放在缓存池的最开始位置
			cache[0] = new CacheImmutable(name);
			pos = 1;
		}
		else{
			//把新创建的对象缓存起来，pos加1
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
