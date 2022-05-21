package com.billa.javathreads;

import java.util.concurrent.Callable;

import com.billa.javathreads.vo.ExcelRecordVO;

public class ProductCallable implements Callable<ExcelRecordVO> {

	@Override
	public ExcelRecordVO call() throws Exception {
		System.out.println("[ProductRunnable] (run) hello");
		ExcelRecordVO vo = new ExcelRecordVO();
		vo.setCell0("HelloWorld");
		return vo;
	}

}
