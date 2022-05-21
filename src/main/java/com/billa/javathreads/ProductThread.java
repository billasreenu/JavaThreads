package com.billa.javathreads;

public class ProductThread extends Thread {
	@Override
	public void run() {
		System.out.println("[ProductThread] (run) hello");
	}

}
