package com.billa.javathreads.cf;

import java.util.concurrent.CompletableFuture;

import com.billa.javathreads.util.SysOutLogger;

public class ProductCompletableFuture {

	public static void main(String[] args) {
		SysOutLogger.info("[ProductCompletableFuture] (main) START");
		try {

			CompletableFuture<String> completableFuture = new CompletableFuture<>();
			completableFuture.complete("Hello World");
			String result = completableFuture.get();

			SysOutLogger.info("[ProductCompletableFuture] (main) result from thread " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		SysOutLogger.info("[ProductCompletableFuture] (main) END");
	}
}
