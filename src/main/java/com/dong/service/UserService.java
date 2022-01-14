package com.dong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.entity.User;
import com.dong.mapper.UserMapper;

public interface UserService{
	List<User> getAllUser();

	
	
	
	
}
