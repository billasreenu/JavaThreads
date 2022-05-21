package com.billa.javathreads.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import com.billa.javathreads.util.SysOutLogger;

public class CompleFuturRunAsync {
	public static void main(String[] args) {
		SysOutLogger.info("[SampleThread] (run) START");
		CompletableFuture<Void> future11 = CompletableFuture.runAsync(new SampleThread());

		try {
			CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
				@Override
				public String get() {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						throw new IllegalStateException(e);
					}
					return "Result of the asynchronous computation";
				}
			});

			String result = future.get();
			SysOutLogger.info(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SysOutLogger.info("[SampleThread] (run) END");
	}
}
