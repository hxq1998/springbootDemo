package org.hanxq.thread;

public class MinusThread implements Runnable {
	
	private  ValueT flag;
	
	

	public ValueT getFlag() {
		return flag;
	}



	public void setFlag(ValueT flag) {
		this.flag = flag;
	}



	@Override
	public void run() {
		synchronized (this) {
			this.flag.setF(this.flag.getF() - 1);
			System.out.println("----" + this.flag.getF());
		}

	}

}
