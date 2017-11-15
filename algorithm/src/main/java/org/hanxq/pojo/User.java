package org.hanxq.pojo;

import org.hanxq.reflect.annotation.Obj;

public class User {
	
	@Obj(length = 5)
	private String name;
	
	@Obj(length = 10)
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
