package com.billa.javathreads.cf;

import java.util.concurrent.CompletableFuture;

import com.billa.javathreads.ProductRunnable;
import com.billa.javathreads.fi.ProductSupplier;
import com.billa.javathreads.util.SysOutLogger;

public class CompleFuturAsync {

	public static void runAsync() {
		SysOutLogger.info("[CompleFuturAsync] (runAsync) START");
		CompletableFuture<Void> future = CompletableFuture.runAsync(new ProductRunnable());
		SysOutLogger.info("[CompleFuturAsync] (runAsync) END");
	}

	public static void supplyAsync() {
		SysOutLogger.info("[CompleFuturAsync] (supplyAsync) START");
		try {
			CompletableFuture<String> future = CompletableFuture.supplyAsync(new ProductSupplier());
			String result = future.get();
			SysOutLogger.info(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SysOutLogger.info("[CompleFuturAsync] (supplyAsync) END");
	}

	public static void main(String[] args) {
		runAsync();
		supplyAsync();
	}
}
