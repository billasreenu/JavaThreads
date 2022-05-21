package com.billa.javathreads;

public class ProductThread extends Thread {

	@Override
	public void run() {
		System.out.println("[ProductThread] (run) Thread name -" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ProductThread th = new ProductThread();
		System.out.println("[ProductThread] (main) Thread name -" + Thread.currentThread().getName());
		th.start();
		System.out.println("[ProductThread] (main) Thread name -" + Thread.currentThread().getName());
	}
}
