package com.dong.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.entity.User;
import com.dong.mapper.UserMapper;
import com.dong.service.UserService;
@Service
public class UserserviceImpl implements UserService{
	@Autowired
	UserMapper userMapper1;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper1.getAllUser();
	}
	
	
	
	
}
