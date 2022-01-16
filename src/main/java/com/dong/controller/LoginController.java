package com.dong.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dong.entity.User;
import com.dong.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping("/allUser")
	public String searchUser(String userName, String password) throws IOException {

		User user = new User();

		List<User> userList = userService.getAllUser();

		String id = userList.get(0).getUserId();

		if ("202201152017".equals(password)) {
			user.setUserId(id + "_01");
		} else if ("202201102018".equals(password)) {
			user.setUserId(id + "_02");
		}
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "success";

	}

}
