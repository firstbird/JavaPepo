package com.testSSH.action;

import com.opensymphony.xwork2.Action;

public class TestAction implements Action {
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		message = "hello world111";
		return "success";
	}
	
}
