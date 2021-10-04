package com.example.demo2.cassandra;

import org.springframework.stereotype.Component;

@Component
public class MessageBean {
	
	public MessageBean()
	{ 
		this.message="Hello!";
	}
	  private String message;
   
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
