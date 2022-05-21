package com.billa.javathreads.util;

import java.time.LocalDateTime;

public class SysOutLogger {
	public static void info(String... args) {
		StringBuffer sb = new StringBuffer();
		for (String str : args)
			sb.append(str);
		System.out.println(LocalDateTime.now() + " " + Thread.currentThread().getName() + " # " + sb.toString());
	}
}
