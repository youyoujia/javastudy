package com.youyou.studyjava2;
/**
 * ����ģʽ
 * @author pc01
 *
 */
 class TimeUtil {
	private static TimeUtil instance;

	private TimeUtil() {
	}
	
	public static TimeUtil getInstance() {
		if (instance == null) {
			instance = new TimeUtil();
		}
		return instance;
	}

	

	

}

