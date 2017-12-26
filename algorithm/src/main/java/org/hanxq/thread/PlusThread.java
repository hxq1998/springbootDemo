package org.hanxq.thread;

public class PlusThread implements Runnable {
	
	// 操作值
	private String flag ;
	
	public String getFlag() {
		return flag;
	}



	public void setFlag(String flag) {
		this.flag = flag;
		System.out.println("++++" + this.flag);
	}



	@Override
	public synchronized void run() {
		// 加1
			this.flag += 1;
	}

}
