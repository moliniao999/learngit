package com.springmvc.test.fastJson;

import java.io.Serializable;

public class JsonVO {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name ;
	private int id;
}
