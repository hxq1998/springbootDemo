package org.hanxq.interview;

import org.hanxq.base.BaseTest;
import org.hanxq.thread.MinusThread;
import org.hanxq.thread.PlusThread;
import org.hanxq.thread.ValueT;
import org.junit.Test;

public class Subject1 extends BaseTest{

	
	@Test
	public void threadSubject(){
		String flag = "0";
		MinusThread m1 = new MinusThread();
		MinusThread m2 = new MinusThread();
		PlusThread p1 = new PlusThread();
		PlusThread p2 = new PlusThread();
		ValueT t = new ValueT();
		t.setF(0);
		m1.setFlag(t);
		m2.setFlag(t);
		p1.setFlag(flag);
		p2.setFlag(flag);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(m1);
		Thread t4 = new Thread(m2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i = 0; i< 10; i++){
			MinusThread p = new MinusThread();
			p.setFlag(t);
			Thread taaa = new Thread(p);
			taaa.start();
		}
		
	}
}
