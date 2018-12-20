package com.liuzhichao.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuzhichao.mvcdemo.entity.User;
import com.liuzhichao.mvcdemo.service.UserService;

@Controller
public class RestfulUserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showRestfulIndex")
	public String showRestfulIndex() {
		return "index";
	}
	
	@RequestMapping("/restful_addUser")
	@ResponseBody
	//留疑:@requestBody注解
	public String restful_addUser(@RequestBody User user) {
		userService.addUser(user);
		return "controller_success";
	}
}
