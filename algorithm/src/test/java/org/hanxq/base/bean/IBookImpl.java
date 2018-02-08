package org.hanxq.base.bean;

import org.hanxq.base.bean.singleton.IBook;

public class IBookImpl implements IBook {
	
	public IBookImpl() {
		System.out.println("创建了xxx");
	}

	@Override
	public String bookName() {
		return "老人与海";
	}

}
