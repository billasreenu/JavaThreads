package com.billa.javathreads;

public class ProductRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("[ProductRunnable] (run) hello");
	}

}
