package com.springmvc.test.fastJson;

import com.alibaba.fastjson.annotation.JSONField;

public class B {
	@JSONField(name="ID")  //序列化采用之后采用"ID"，而不是"id"
	private int id = 147;
	private String bname = "小强";
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
}
