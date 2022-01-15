package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDao;
import com.example.demo.service.IUserService;

import com.example.demo.vo.User;



@Service("userService")
public  class  UserServiceImpl  implements  IUserService{
	
	
	
	@Autowired
	private IUserDao userDao;
	
	
	@Override
	public List<User> selectAllUsers(){
		return userDao.selectUsers();
	}

}
