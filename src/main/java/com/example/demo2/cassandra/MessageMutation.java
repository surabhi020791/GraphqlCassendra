package com.example.demo2.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class MessageMutation implements GraphQLMutationResolver {
	
	@Autowired
	MessageService messageservice;
	public String addMessage(String message) {
		messageservice.setMessage(message);
		return messageservice.getMessage();
	}

}
