package org.hanxq.hock;

import org.hanxq.hock.abst.HockAbstr;

public class HockService extends HockAbstr {
	
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public HockService (String fileName){
		this.fileName = fileName;
	}

	@Override
	public String fileName() {
		return this.getFileName();
	}
	
	
	public static void main(String[] args) {
		HockService h = new HockService("hello");
		// 不需要关注如何实现，仅仅需要关注实现方法需要哪些前置条件
		String file = h.createFile();
		System.out.println(file);
	}

}
