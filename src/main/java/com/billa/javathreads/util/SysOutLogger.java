package com.billa.javathreads.util;

public class SysOutLogger {
	public static void info(String... args) {
		StringBuffer sb = new StringBuffer();
		for (String str : args)
			sb.append(str);
		System.out.println(Thread.currentThread().getName() + " " + sb.toString());
	}
}
