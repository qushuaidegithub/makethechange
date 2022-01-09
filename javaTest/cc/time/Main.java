package com.test.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static ConnectionPool pool = null;

	public static void main(String[] args) throws ParseException {
		String onTime = "22:17:00";
		long initDelay = getTimeMillis(onTime) - System.currentTimeMillis();
		long oneDay = 1L * 24 * 60 * 60 * 1000;
		initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;  
		System.out.println("=====初始化连接池");
		pool = ConnectionPool.getInstance();// 初始化连接池
		System.out.println("=====初始化连接池结束");
		System.out.println("=====初始化线程池");
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(100);
		System.out.println("=====初始化线程池结束");
		
		
		for (int i = 0; i < 1; i++) {
			threadPool.scheduleAtFixedRate(new Task(), 100L, 10000L, TimeUnit.MILLISECONDS);
			//threadPool.scheduleAtFixedRate(new MyTask(), initDelay, oneDay, TimeUnit.MILLISECONDS);
		}
		
		pool.closePool();// 关闭数据库池
		threadPool.shutdown();// 关闭线程池

	}
	
	
	public static long getTimeMillis(String time) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = dateFormat.parse((dayFormat.format(new Date())+" "+time));
		return date.getTime();
	}
}
