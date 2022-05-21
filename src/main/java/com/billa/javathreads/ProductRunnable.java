package com.billa.javathreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.billa.javathreads.util.SysOutLogger;

public class ProductRunnable implements Runnable {

	@Override
	public void run() {
		SysOutLogger.info("[ProductRunnable] (run) from runnable START");
		try {
			Thread.sleep(10_000l);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SysOutLogger.info("[ProductRunnable] (run) from runnable END");
	}

	public static void main1(String[] args) {
		ProductRunnable th = new ProductRunnable();
		Thread t = new Thread(th);
		System.out.println("[ProductRunnable] (main)");
		t.start();
		System.out.println("[ProductRunnable] (main)");
	}

	public static void main(String[] args) {
		SysOutLogger.info("[ProductRunnable] (main) START");

		ProductRunnable th = new ProductRunnable();
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor();
			executor.execute(th);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executor != null)
				executor.shutdown();
		}
		SysOutLogger.info("[ProductRunnable] (main) END");
	}
}
