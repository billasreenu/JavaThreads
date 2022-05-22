package com.billa.javathreads.fi;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import com.billa.javathreads.util.SysOutLogger;

public class ProductSupplier implements Supplier<String> {

	@Override
	public String get() {
		SysOutLogger.info("[ProductSupplier] (get) STARTED");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
		SysOutLogger.info("[ProductSupplier] (get) END");
		return "Result of the asynchronous computation - ProductSupplier";
	}

}
