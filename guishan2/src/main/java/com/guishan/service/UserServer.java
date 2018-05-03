package com.guishan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guishan.dao.UserDao;
import com.guishan.entity.User;

@Service
public class UserServer {

	@Autowired
	private UserDao userdao;
	
	public User query(){
		return userdao.query();
	}
}
