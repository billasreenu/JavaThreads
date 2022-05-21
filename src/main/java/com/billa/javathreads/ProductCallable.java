package com.billa.javathreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.billa.javathreads.util.SysOutLogger;
import com.billa.javathreads.vo.ExcelRecordVO;

public class ProductCallable implements Callable<ExcelRecordVO> {

	@Override
	public ExcelRecordVO call() throws Exception {
		SysOutLogger.info("[ProductCallable] (call) STARTED");
		ExcelRecordVO vo = new ExcelRecordVO();
		vo.setCell0("HelloWorld");
		SysOutLogger.info("[ProductCallable] (call) END");
		return vo;
	}

	public static void main1(String[] args) {
		SysOutLogger.info("[ProductCallable] (main) START");

		ProductCallable c = new ProductCallable();
		FutureTask futureTask = new FutureTask(c);

		try {
			Thread th = new Thread(futureTask);
			th.start();

			while (!futureTask.isDone()) {
				SysOutLogger.info("[ProductCallable] (main) wait for 5 sec");
				Thread.sleep(5_000l);
			}

			ExcelRecordVO vo = (ExcelRecordVO) futureTask.get();
			SysOutLogger.info(vo.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		SysOutLogger.info("[ProductCallable] (main) END");
	}

	public static void main(String[] args) {
		SysOutLogger.info("[ProductCallable] (main) START");

		ProductCallable th = new ProductCallable();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future futureTask = executor.submit(th);
		try {
			while (!futureTask.isDone()) {
				SysOutLogger.info("[ProductCallable] (main) wait for 5 sec");
				Thread.sleep(5_000l);
			}
			ExcelRecordVO vo = (ExcelRecordVO) futureTask.get();
			SysOutLogger.info(vo.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
		SysOutLogger.info("[ProductCallable] (main) END");
	}

}
