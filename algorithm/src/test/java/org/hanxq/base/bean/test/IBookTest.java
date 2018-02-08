package org.hanxq.base.bean.test;

import org.hanxq.base.BaseTest;
import org.hanxq.base.bean.Adapter;
import org.hanxq.base.bean.SingleTonConfig;
import org.hanxq.base.bean.singleton.IBook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IBookTest extends BaseTest {
	
	@Autowired
	Adapter adpater;
	
	@Test
	public void single()throws Exception{
		adpater.getName();
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SingleTonConfig.class);
		IBook book = (IBook)context.getBean("book");
		IBook book1 = (IBook)context.getBean("book");
		System.out.println(book);
		System.out.println(book1);
	}

}
