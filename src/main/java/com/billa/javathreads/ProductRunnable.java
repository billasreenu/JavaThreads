package com.billa.javathreads;

public class ProductRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("[ProductRunnable] (run)  Thread name -" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ProductRunnable th = new ProductRunnable();
		Thread t = new Thread(th);
		System.out.println("[ProductRunnable] (main) Thread name -" + Thread.currentThread().getName());
		t.start();
		System.out.println("[ProductRunnable] (main) Thread name -" + Thread.currentThread().getName());
	}
}
