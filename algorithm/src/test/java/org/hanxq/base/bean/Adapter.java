package org.hanxq.base.bean;

import javax.websocket.server.ServerEndpoint;

import org.apache.catalina.core.ApplicationContext;
import org.hanxq.base.bean.singleton.IBook;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 测试new一个bean是否是单例
 * @author hanxq
 *
 */
@Service
public class Adapter {
	
	private IBook book;
	
	public void getName(){
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SingleTonConfig.class);
		book = (IBook)context.getBean("book");
		System.out.println(book);
	}

}
