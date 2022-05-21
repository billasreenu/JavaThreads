package com.billa.javathreads.cf;

import com.billa.javathreads.util.SysOutLogger;

public class SampleThread implements Runnable {
	@Override
	public void run() {
		SysOutLogger.info("[SampleThread] (run) START");
		try {
			Thread.sleep(10_000l);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SysOutLogger.info("[SampleThread] (run) END");
	}
}
